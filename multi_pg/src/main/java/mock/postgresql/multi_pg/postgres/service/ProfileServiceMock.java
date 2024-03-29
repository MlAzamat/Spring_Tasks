package mock.postgresql.multi_pg.postgres.service;

import org.springframework.stereotype.Service;
import mock.postgresql.multi_pg.postgres.exception.ProfileNotFoundException;
import mock.postgresql.multi_pg.postgres.model.Profile;

@Service
public class ProfileServiceMock implements ProfileService {

    @Override
    public Profile getProfile(int personId) {
        // имитируем обращение к БД
        if (personId == 123) {
            return new Profile(
                    personId,
                    "Иван",
                    "Иванов",
                    23
            );
        } else {
            throw new ProfileNotFoundException(personId);
        }
    }

    @Override
    public void createProfile(String firstName, String secondName, int age) {
    }

    @Override
    public void updateProfile(String firstName, String secondName, int age, int id) {
    }

    @Override
    public void deleteProfile(int id) {
    }
}
