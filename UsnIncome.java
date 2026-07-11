UsnIncome.java (УСН Доходы 6%)

java

package taxes; public class UsnIncome extends TaxSystem { @id86240433 (@Override) public int calcTaxFor(int debit, int credit) { // Налог 6% от доходов int tax = (int) (debit * 0.06); return Math.max(0, tax); } }