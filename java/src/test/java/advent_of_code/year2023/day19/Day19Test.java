package advent_of_code.year2023.day19;

import static advent_of_code.TestUtils.getLines;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class Day19Test {

    Day19 day = new Day19();

    @Test
    void should_solve_example() {
        List<String> lines = getLines("year2023/day19/example.txt");

        var result = day.part1(lines);

        assertThat(result).isEqualTo(19114);
    }

    @Test
    void should_solve_part_1() {
        List<String> lines = getLines("year2023/day19/input.txt");

        var result = day.part1(lines);

        assertThat(result).isEqualTo(263678);
    }

    @Test
    void should_solve_part_2_example() {
        List<String> lines = getLines("year2023/day19/example.txt");

        var result = day.part2(lines);

        assertThat(result).isEqualTo(167409079868000L);
    }

    @Test
    void should_solve_part_2() {
        List<String> lines = getLines("year2023/day19/input.txt");

        var result = day.part2(lines);

        assertThat(result).isEqualTo(125455345557345L);
    }
}
