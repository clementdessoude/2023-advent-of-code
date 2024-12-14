package advent_of_code.year2024.day7;

import static advent_of_code.TestUtils.getLines;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class Day7Test {

    Day7 day = new Day7();

    @Test
    void should_solve_example() {
        List<String> lines = getLines("year2024/day7/example.txt");

        var result = day.part1(lines);

        assertThat(result).isEqualTo(3749);
    }

    @Test
    void should_solve_part_1() {
        List<String> lines = getLines("year2024/day7/input.txt");

        var result = day.part1(lines);

        assertThat(result).isEqualTo(4998764814652L);
    }

    @Test
    void should_solve_part_2_example() {
        List<String> lines = getLines("year2024/day7/example.txt");

        var result = day.part2(lines);

        assertThat(result).isEqualTo(2);
    }

    @Test
    void should_solve_part_2() {
        List<String> lines = getLines("year2024/day7/input.txt");

        var result = day.part2(lines);

        assertThat(result).isEqualTo(977);
    }
}
