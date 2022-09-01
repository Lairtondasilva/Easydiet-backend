package com.gft.nutritionist.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.GenericGenerator;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "tb_nutritionist")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
public class NutritionistModel {
    @Id
    @GeneratedValue(generator = "hibernate-uuid")
    @GenericGenerator(name = "hibernate-uuid", strategy = "uuid2")
    @Column(name = "uuid", unique = true)
    @EqualsAndHashCode.Include
    private String id;

    @NotNull
    private String name;

    @NotNull
    private String crnNumber;

    @NotNull(message = "O campo e-mail é obrigatório!")
    @Email(message = "O campo Usuário deve ser um e-mail válido!")
    private String email;

    @NotNull
    @Size(min = 8, max = 64)
    private String password;

    @NotNull
    private String dietType;

    @Transient
    PatientModel patient;
}