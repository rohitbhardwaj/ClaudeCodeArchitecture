-- Data model impact:
-- May need discountCode, discountAmount, promotionId.

ALTER TABLE orders ADD COLUMN discount_code VARCHAR(64);
ALTER TABLE orders ADD COLUMN discount_amount_cents INTEGER DEFAULT 0;
ALTER TABLE orders ADD COLUMN promotion_id VARCHAR(64);
