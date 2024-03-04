package ro.ase.acs.dip.dicontainer.main;

import ro.ase.acs.dip.dicontainer.computations.SumContract;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Main {
    @Bean
    private SumContract sum;

    private void initializeProgram() {
        for(Field f : this.getClass().getDeclaredFields()) {
            if(f.isAnnotationPresent(Bean.class)) {
                try {
                    Class<?> implementation = Class.forName(f.getType().getName().replace("Contract", ""));
                    f.set(this, implementation.getConstructor().newInstance());
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e) {
                    throw new RuntimeException(e);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InstantiationException e) {
                    throw new RuntimeException(e);
                } catch (NoSuchMethodException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static void main(String[] args) {
        Main program = new Main();
        program.initializeProgram();
        program.sum.sum(4, 5);
    }
}
