package model;

import java.util.ArrayList;
import java.util.List;

public class Ladder {
    private final GenerateStrategy generateStrategy;
    private final List<Row> rows = new ArrayList<>();

    public Ladder(GenerateStrategy generateStrategy) {
        this.generateStrategy = generateStrategy;
    }

    public void init(int countOfPlayer, int countOfHeight) {
        for (int i = 0; i < countOfHeight; i++) {
            rows.add(new Row(countOfPlayer, generateStrategy));
        }
    }

    public int getRowSize() {
        return rows.size();
    }
}
