package com.dio.projeto.model;

import lombok.*;
import net.bytebuddy.asm.Advice;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Audited
public class TipoData {
    @Id
    private Long id;
    private String descricao;
}
