package answers.сh3.ex12;

public class Invoice {
    private String partNumber;
    private String partDescription;
    private int partCount;
    private double partCost;

    public Invoice(String partNumber, String partDescription, int partCount, double partCost) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.partCount = partCount;
        this.partCost = partCost;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getPartCount() {
        return partCount;
    }

    public void setPartCount(int partCount) {
        this.partCount = partCount;
    }

    public double getPartCost() {
        return partCost;
    }

    public void setPartCost(double partCost) {
        this.partCost = partCost;
    }

    public double getInvoiceAmount(){
        if (this.partCount < 0) {
            this.partCount = 0;
        }
        if (this.partCost < 0) {
            partCost = 0.0;
        }
        double sum;
        sum = partCount * partCost;
        return sum;
    }
}
