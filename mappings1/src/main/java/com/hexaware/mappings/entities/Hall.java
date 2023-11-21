package com.hexaware.mappings.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "hall")
public class Hall {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hall_id")
    private int hallId;

    @Column(name = "hall_name")
    private String hallName;

    @OneToMany(mappedBy = "hall", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<MovieShow> shows = new HashSet<>();

    // Constructors, getters, and setters

    public int getHallId() {
        return hallId;
    }

    public void setHallId(int hallId) {
        this.hallId = hallId;
    }

    public String getHallName() {
        return hallName;
    }

    public void setHallName(String hallName) {
        this.hallName = hallName;
    }

    public Set<MovieShow> getShows() {
        return shows;
    }

    public void setShows(Set<MovieShow> shows) {
        this.shows = shows;
    }

    public void addShow(MovieShow show) {
        shows.add(show);
        show.setHall(this);
    }
}
