package com.greg.rover;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RoverTest {

    @Test
    public void shouldRotateRight() {
        Rover rover = new Rover();

        assertThat(rover.execute("R")).isEqualTo("0:0:E");
    }

    @Test
    public void shouldReturnSouthwhenRotateRight2Times() {
        Rover rover = new Rover();

        assertThat(rover.execute("RR")).isEqualTo("0:0:S");
    }

    @Test
    public void shouldReturnWestwhenRotateRight3Times() {
        Rover rover = new Rover();

        assertThat(rover.execute("RRR")).isEqualTo("0:0:W");
    }

    @Test
    public void shouldReturnNorthwhenRotateRight4Times() {
        Rover rover = new Rover();

        assertThat(rover.execute("RRRR")).isEqualTo("0:0:N");
    }

    @Test
    public void shouldRotateLeft() {
        Rover rover = new Rover();

        assertThat(rover.execute("L")).isEqualTo("0:0:W");
    }

    @Test
    public void shouldReturnSouthwhenRotateLeft2Times() {
        Rover rover = new Rover();

        assertThat(rover.execute("LL")).isEqualTo("0:0:S");
    }

    @Test
    public void shouldReturnEastwhenRotateLeft3Times() {
        Rover rover = new Rover();

        assertThat(rover.execute("LLL")).isEqualTo("0:0:E");
    }

    @Test
    public void shouldReturnNorthwhenRotateLeft4Times() {
        Rover rover = new Rover();

        assertThat(rover.execute("LLLL")).isEqualTo("0:0:N");
    }

}
