package entities;

import jakarta.persistence.*;
import lombok.*;

// indica que essa classe é uma entidade
@Entity

// constroi todos os contrutores da entidade
@AllArgsConstructor

//controi todos os construtores que não possuem argumentos
@NoArgsConstructor
//anotetions que precisa na classe
@Getter
@Setter
@Table(name= "tp_clientes")
public class Clientes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_cliente;

   private String cpf;
   private String email;
   private String telefone;
   private String primeiro_nome;
   private String sobrenome;

    // Criação das chaves estrangeiras
    @OneToOne
    Endereco endereco;

    @OneToOne
    Pagamento pagamento;

    @ManyToOne
    Pedido pedido;
}
