package io.github.MIRIANJSM.payloads.model.usuarios;

import lombok.Data;

@Data
public class UsuariosModel {

    private String username;
    private String password;

    public UsuariosModel(String username, String password) {
        this.username = "kminchelle";
        this.password = "0lelplR";

    }

    public UsuariosModel() {

    }
}
