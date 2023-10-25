package io.github.MIRIANJSM.payloads;

import com.google.gson.Gson;
import io.github.MIRIANJSM.payloads.model.usuarios.UsuariosModel;
import lombok.Data;

@Data
public class UsuariosPayload {

    public static String toJson(){
        UsuariosModel usuariosModel = new UsuariosModel();
        return new Gson().toJson(usuariosModel);
    }

    public static String toJson(String username, String password){
        UsuariosModel usuariosModel = new UsuariosModel(username, password);
        return new Gson().toJson(usuariosModel);
    }
}
