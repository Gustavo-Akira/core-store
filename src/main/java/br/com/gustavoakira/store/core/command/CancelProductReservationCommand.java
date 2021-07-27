package br.com.gustavoakira.store.core.command;

import org.axonframework.modelling.command.TargetAggregateIdentifier;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CancelProductReservationCommand {
	@TargetAggregateIdentifier
	private final String productId;
	
	private final int quantity;
	private final String userId;
	private final String orderId;
	private final String reason;
}