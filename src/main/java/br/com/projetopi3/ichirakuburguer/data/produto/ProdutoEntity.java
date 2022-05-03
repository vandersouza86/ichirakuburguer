package br.com.projetopi3.ichirakuburguer.data.produto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "PRODUTO")
public class ProdutoEntity {

    @Id
    private UUID codigo;

    @Column
    private String produtoNome;

    @Column
    private String descricao;

    @Column
    private Long codigoBarras;

    @Column
    private Float precoVenda;

    @Column
    private Float estoque;

    @Column
    private Boolean ativo;

}
