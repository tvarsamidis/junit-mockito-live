package gr.codehub.mock.p01_test_doubles.q02_dummy;

import java.util.List;

public class FakePhoneRepository implements PhoneRepository {

    @Override
    public void save(Phone phone) {
    }

    @Override
    public List<Phone> findAll() {
        return null;
    }
}
