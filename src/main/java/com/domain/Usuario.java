
package com.domain;

import java.io.Serializable;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

@Data
@Entity
@Table(name = "Usuario")
public class Usuario  implements Serializable  {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long id_usuario;
    private String email;
    private String username;
    private String password;

    public Usuario(String email, String username, String password) {
        this.email = email;
        this.username = username;
        this.password = password;
    }
    

    
}
