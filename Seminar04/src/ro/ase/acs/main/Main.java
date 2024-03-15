package ro.ase.acs.main;

import ro.ase.acs.exceptions.NoSuchServerException;
import ro.ase.acs.simplefactory.*;
import ro.ase.acs.singleton.Logger;
import ro.ase.acs.singleton.LoggerVersion2;
import ro.ase.acs.singleton.LoggerVersion3;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Hello world!");
        Logger otherLogger = Logger.getInstance();
        System.out.println(logger == otherLogger);

        LoggerVersion2 loggerVersion2 =
                LoggerVersion2.instance;
        loggerVersion2.log("Hi!");

        LoggerVersion3 loggerVersion3 =
                LoggerVersion3.INSTANCE;
        loggerVersion3.log("Ola!");

        RestApiFactory factory = new RestApiFactory();
        RestApi api = factory.getRestApi(
                "Development");
        if (api != null) {
            api.connect();
        }

        RestApiFactoryVersion2 factoryVersion2 =
                new RestApiFactoryVersion2();
        try {
            api = factoryVersion2.getRestApi(ServerType.PRODUCTION);
            api.connect();
        } catch (NoSuchServerException e) {
            e.printStackTrace();
        }
    }
}
