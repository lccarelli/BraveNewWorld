package tech.lab.bravenewworld.infraestructure.persistence.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import java.time.LocalDateTime;

@Entity
@Table(name = "characters")
@EntityListeners(AuditingEntityListener.class)
@Data
@NoArgsConstructor
public class CharacterEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String status;

    @Column(nullable = false)
    private String species;

    @Column(nullable = true)
    private String type;

    @Column(nullable = false)
    private String gender;

    @Column(nullable = false)
    private String origin;

    @Column(nullable = false)
    private String image;

    @Column(nullable = false)
    private LocalDateTime created;

}
