package edu.kis.vh.nursery;

/**
 * Klasa HanoiRhymer dziedziczy po klasie DefaultCountingOutRhymer.
 * Zawiera pole totalRejected oraz metody reportRejected(), countIn(int in).
 * ---------------------------------------------------------------------------
 * Klasa pozwala na dodanie liczb malejąco do tablicy numbers znajdującej się w DefaultCountingOutRhymer.
 * Próba dodania liczby większej od poprzedniej się nie powiedzie,
 * oraz spowoduje zwiększenie licznika totalRejected.
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    /**
     * Metoda reportRejected() zwraca liczbę typu int,
     * dokładniej zwraca wartość pola totalRejected,
     * który opisuje ile liczb nie udało się dodać do tablicy,
     * ponieważ były większe od poprzedniej dodanej.
     */
    public int reportRejected() {
        return totalRejected;
    }

    /**
     * Metoda countIn(int in) przyjmuje liczbę typu int, nie zwraca żadnej wartości.
     * Pierwsze wywołanie metody zawsze spowoduje dodanie jej do tablicy numbers.
     * Jeśli w następnych wywołaniach funkcji podamy liczbę większą, zostanie zwiększony licznik totalRejected.
     * Metoda pozwala na dodawanie co raz to mniejszych liczb,
     * dopóki ich ilość nie będzie równa MAX_SIZE z klasy DefaultCountingOutRhymer.
     */
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
