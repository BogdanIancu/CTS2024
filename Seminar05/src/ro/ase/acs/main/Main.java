package ro.ase.acs.main;

import ro.ase.acs.factorymethod.AbstractOfficeDocumentFactory;
import ro.ase.acs.factorymethod.OfficeDocument;
import ro.ase.acs.factorymethod.WordDocumentFactory;
import ro.ase.acs.prototype.BuildingBlock;
import ro.ase.acs.prototype.PrototypeCollection;
import ro.ase.acs.prototype.StoneBlock;
import ro.ase.acs.prototype.WoodBlock;
import ro.ase.acs.singletonregistry.SingletonRegistry;

public class Main {
    public static void main(String[] args) {
        SingletonRegistry registry = new SingletonRegistry();
        SingletonRegistry.Logger logger = registry.getSingleton(
                SingletonRegistry.Logger.class.getSimpleName());
        logger.log("First log");

        SingletonRegistry.DatabaseConnection db = registry.getSingleton(
                SingletonRegistry.DatabaseConnection.class.getSimpleName());
        db.connect();

        AbstractOfficeDocumentFactory factory =
                new WordDocumentFactory();
        OfficeDocument document = factory.createDocument();
        document.open();

        BuildingBlock block1 = new WoodBlock();
        BuildingBlock block2 = new StoneBlock();
        BuildingBlock block3;
        try {
            block3 = (BuildingBlock) block1.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        BuildingBlock block4;
        try {
            block4 = (BuildingBlock) block2.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        block1.render();
        block2.render();
        block3.render();
        block4.render();

        PrototypeCollection prototypeCollection =
                new PrototypeCollection();
        BuildingBlock block5 =
                prototypeCollection.getBlock("stone");
        BuildingBlock block6 =
                prototypeCollection.getBlock("wood");
        block5.render();
        block6.render();
    }
}
