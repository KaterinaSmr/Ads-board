package ru.egorbacheva.ads.service;

import ru.egorbacheva.ads.dto.Register;

public interface AuthService {
    boolean login(String userName, String password);

    boolean register(Register register);
}
