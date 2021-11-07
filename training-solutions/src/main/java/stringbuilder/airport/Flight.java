package stringbuilder.airport;

public class Flight {
    private String flightNumber;
    private Status status;

    @Override
    public String toString() {
        return "Flight{" +
                "flightNumber='" + flightNumber + '\'' +
                ", status=" + status +
                '}';
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Flight(String flightNumber, Status status) {
        this.flightNumber = flightNumber;
        this.status = status;
    }
}