package entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table
public class StatusdoPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_status_do_pedido;
    private boolean status;
    private Date data_do_pedido;
}
