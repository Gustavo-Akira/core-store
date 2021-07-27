package br.com.gustavoakira.store.core.command;

import org.axonframework.modelling.command.TargetAggregateIdentifier;

import br.com.gustavoakira.store.core.models.PaymentDetails;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ProccessPaymentCommand {
	@TargetAggregateIdentifier
	private final String paymentId;
	private final String orderId;
	private final PaymentDetails paymentDetails;
}
