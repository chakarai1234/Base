package com.chakarapani.base.Entity;

import com.chakarapani.base.Enums.Roles;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;
import java.util.UUID;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "entitlement")
public class Entitlement {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false, columnDefinition = "uuid")
	@JsonIgnore
	private UUID id;

	@JsonProperty("user_id")
	private UUID userId;

	@JsonProperty("username")
	private String username;

	@JsonProperty("roles")
	@Enumerated(EnumType.STRING)
	private Roles roles;
}
