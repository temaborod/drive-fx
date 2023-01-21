package com.project.entity;

public class TicketEndEntity {

    private int ticketResultStatus;
    private Long correct;

    private TicketWithAnswersEntity[] ticket;

    public int getTicketResultStatus() {
        return ticketResultStatus;
    }

    public Long getCorrect() {
        return correct;
    }

    public TicketWithAnswersEntity[] getTicket() {
        return ticket;
    }

    public TicketWithAnswersEntity getTicket(int index){
        return ticket[index];
    }
}
