UsnIncomeMinusExpenses.java (УСН Доходы минус Расходы 15%)

java

package taxes; public class UsnIncomeMinusExpenses extends TaxSystem { @id86240433 (@Override) public int calcTaxFor(int debit, int credit) { // Налог 15% от разницы доходов и расходов int tax = (int) ((debit - credit) * 0.15); return Math.max(0, tax); } }