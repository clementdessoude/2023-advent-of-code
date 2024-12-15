package advent_of_code.year2024.day13;

import static advent_of_code.TestUtils.getLines;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class Day13Test {

    Day13 day = new Day13();

    @Test
    void should_solve_example() {
        List<String> lines = getLines("year2024/day13/example.txt");

        var result = day.part1(lines);

        assertThat(result).isEqualTo(480);
    }

    @Test
    void should_solve_part_1() {
        List<String> lines = getLines("year2024/day13/input.txt");

        var result = day.part1(lines);

        assertThat(result).isEqualTo(35729);
    }

    @Test
    void should_solve_part_2_example() {
        List<String> lines = getLines("year2024/day13/example.txt");

        var result = day.part2(lines);

        assertThat(result).isEqualTo(875318608908L);
    }

    @Test
    void should_solve_part_2() {
        List<String> lines = getLines("year2024/day13/input.txt");

        var result = day.part2(lines);

        assertThat(result).isEqualTo(88584689879723L);
    }
}