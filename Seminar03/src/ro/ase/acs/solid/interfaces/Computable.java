package ro.ase.acs.solid.interfaces;

import ro.ase.acs.solid.exceptions.InvalidListException;

import java.util.List;

public interface Computable {
    long computeResult(List<Integer> list) throws InvalidListException;
}
