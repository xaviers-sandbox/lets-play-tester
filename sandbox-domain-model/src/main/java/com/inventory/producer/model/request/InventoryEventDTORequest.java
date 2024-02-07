package com.inventory.producer.model.request;

import com.inventory.producer.enums.InventoryEventType;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;


@Builder
@Data
public class InventoryEventDTORequest {
	String eventId;
	InventoryEventType eventType;
	@Valid
	@NotNull(message = "Item Cannot Be Empty or Null")
	ItemDTORequest item;
}
