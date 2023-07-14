package model.repository;

import model.entity.Calculator;
import model.vo.Expression;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

class MemoryCalculatorRepositoryTest {
    CalculatorRepository repository = new MemoryCalculatorRepository();

    @Test
    void findAll() {
        //give
        Calculator calculator1 = new Calculator(new Expression("1 + 1"), 2);
        repository.save(calculator1);
        Calculator calculator2 = new Calculator(new Expression("3 + 2 * 4 - 9 / 3"), 8);
        repository.save(calculator2);

        //when
        List<Calculator> result = repository.findAll();

        //then
        assertThat(result.size()).isEqualTo(2);
    }
}
