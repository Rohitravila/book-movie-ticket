package com.jsp.book_my_ticket.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SeatDto {

    @NotBlank(message = "Seat Number is required")
    private String seatNumber;

    @NotBlank(message = "Seat Category is required")
    private String category;

    @NotNull(message = "Screen ID is required")
    private Long screenId;

    @NotNull(message = "Seat Row is required")
    private Character seatRow; // e.g., 'A', 'B'

    @NotNull(message = "Seat Column is required")
    private Integer seatColumn; // e.g., 1, 2, 3
}
