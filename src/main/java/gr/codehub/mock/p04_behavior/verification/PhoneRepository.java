package gr.codehub.mock.p04_behavior.verification;

public interface PhoneRepository {
    void save(Phone phone);

    Phone findPhoneById(String phoneId);
}
