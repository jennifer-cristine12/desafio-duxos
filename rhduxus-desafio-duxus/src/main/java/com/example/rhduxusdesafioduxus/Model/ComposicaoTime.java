package com.example.rhduxusdesafioduxus.Model;




import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;


@Entity
@Table(name = "composicao_time")
@Getter
@Setter
public class ComposicaoTime {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne
	private Time time;

	@ManyToOne
	private Integrante integrante;

	public ComposicaoTime() {
	}

	public ComposicaoTime(Time time, Integrante integrante) {//metodo construtor
		this.time = time;
		this.integrante = integrante;
	}

	
	@Override
	public final boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof ComposicaoTime)) return false;
		ComposicaoTime that = (ComposicaoTime) o;
		return id == that.id && Objects.equals(time, that.time) && Objects.equals(integrante, that.integrante);
	}

	@Override
	public final int hashCode() {
		return Objects.hash(id, time, integrante);
	}

	@Override
	public String toString() {
		return "ComposicaoTime{" +
				"time=" + time +
				", integrante=" + integrante +
				'}';
	}
}
