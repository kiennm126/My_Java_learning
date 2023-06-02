package B8;

import java.util.ArrayList;
import java.util.List;

public class CardManager {

    private List<Card> cards;

    public CardManager() {
        this.cards = new ArrayList<>();
    }

    public void addNewCard(Card card) {
        this.cards.add(card);
    }

    public boolean removeCard(String code) {
        Card card = this.cards.stream()
                              .filter(t -> t.getBorrowCode().equals(code))
                              .findFirst()
                              .orElse(null);
        if (card == null) {
            return false;
        }
        this.cards.remove(card);
        return true;
    }
    public void showCardList() {
        this.cards.forEach(p -> System.out.println(p.toString()));
    }
}