package gr.codehub.mock.p01_test_doubles.q03_stub;

import java.util.List;

public class PhoneRepositoryStub implements PhoneRepository {
    @Override
    public List<Phone> findNewPhones(int days) {
       return null;
    }
}
