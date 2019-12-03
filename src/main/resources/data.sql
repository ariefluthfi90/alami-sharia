DELETE FROM seller_tbl;
DELETE FROM product_tbl;

INSERT INTO seller_tbl (id, created_date, modified_date, city, name) VALUES ('c0a8016d-6ec7-1865-816e-c799a8ae0000', '2019-12-03 00:12:46.477', '2019-12-03 00:12:46.477', 'Jakarta', 'Seller 1');
INSERT INTO seller_tbl (id, created_date, modified_date, city, name) VALUES ('c0a8016d-6ec7-1865-816e-c79a0f940001', '2019-12-03 00:13:12.846', '2019-12-03 00:13:12.846', 'Jakarta', 'Seller 2');
INSERT INTO seller_tbl (id, created_date, modified_date, city, name) VALUES ('c0a8016d-6ec7-1865-816e-c79a0f940002', '2019-12-03 00:13:12.846', '2019-12-03 00:13:12.846', 'Jakarta', 'Seller 3');
INSERT INTO seller_tbl (id, created_date, modified_date, city, name) VALUES ('c0a8016d-6ec7-1865-816e-c79a0f940003', '2019-12-03 00:13:12.846', '2019-12-03 00:13:12.846', 'Jakarta', 'Seller 4');
INSERT INTO seller_tbl (id, created_date, modified_date, city, name) VALUES ('c0a8016d-6ec7-1865-816e-c79a0f940004', '2019-12-03 00:13:12.846', '2019-12-03 00:13:12.846', 'Jakarta', 'Seller 5');

INSERT INTO product_tbl (id, created_date, modified_date, name, price, seller_id, uom) VALUES ('c0a8016d-6ec7-1162-816e-c7a1efac0000', '2019-12-03 00:21:48.935', '2019-12-03 00:21:48.935', 'Product 1', 1000, 'c0a8016d-6ec7-1865-816e-c79a0f940001', 'Test');
INSERT INTO product_tbl (id, created_date, modified_date, name, price, seller_id, uom) VALUES ('c0a8016d-6ec7-1162-816e-c7a1efac0001', '2019-12-03 00:21:48.935', '2019-12-03 00:21:48.935', 'Product 2', 1000, 'c0a8016d-6ec7-1865-816e-c79a0f940001', 'Test');
INSERT INTO product_tbl (id, created_date, modified_date, name, price, seller_id, uom) VALUES ('c0a8016d-6ec7-1162-816e-c7a1efac0002', '2019-12-03 00:21:48.935', '2019-12-03 00:21:48.935', 'Product 3', 1000, 'c0a8016d-6ec7-1865-816e-c79a0f940002', 'Test');
INSERT INTO product_tbl (id, created_date, modified_date, name, price, seller_id, uom) VALUES ('c0a8016d-6ec7-1162-816e-c7a1efac0003', '2019-12-03 00:21:48.935', '2019-12-03 00:21:48.935', 'Product 4', 1000, 'c0a8016d-6ec7-1865-816e-c79a0f940003', 'Test');
INSERT INTO product_tbl (id, created_date, modified_date, name, price, seller_id, uom) VALUES ('c0a8016d-6ec7-1162-816e-c7a1efac0004', '2019-12-03 00:21:48.935', '2019-12-03 00:21:48.935', 'Product 5', 1000, 'c0a8016d-6ec7-1865-816e-c79a0f940003', 'Test');
INSERT INTO product_tbl (id, created_date, modified_date, name, price, seller_id, uom) VALUES ('c0a8016d-6ec7-1162-816e-c7a1efac0005', '2019-12-03 00:21:48.935', '2019-12-03 00:21:48.935', 'Product 6', 1000, 'c0a8016d-6ec7-1865-816e-c79a0f940004', 'Test');