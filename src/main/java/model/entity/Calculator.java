package model.entity;

import model.vo.Expression;

public class Calculator {
    private Long id;
    private Expression expression;
    private int calculationResult;

    public Calculator(Expression expression, int calculationResult) {
        this.expression = expression;
        this.calculationResult = calculationResult;
    }

    public Long getId() {
        return id;
    }

    public Expression getExpression() {
        return expression;
    }

    public int getCalculationResult() {
        return calculationResult;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
