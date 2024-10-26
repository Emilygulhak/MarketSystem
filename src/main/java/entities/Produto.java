package entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_produto;
    private int valor;
    private String categoria_produto;
    private String codigo_do_produto;
    private String descricao;

    // chaves estrangerias
    @OneToOne
    private Pedido pedido;

    @OneToMany
    private Estoque estoque;
}
