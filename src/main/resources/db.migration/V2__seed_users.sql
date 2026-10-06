-- Usuarios de ejemplo para la versión base. El campo password es un valor de relleno:
-- el cifrado y el login se implementan en la clase 1 (Spring Security + JWT).
INSERT INTO users (name, email, password, role, created_at) VALUES
('Edwin Admin', 'edwin@coffeshop.com', '$2a$12$En7DB3c/TxOSXduq0sMJd.TGteyERi0DD09MNZcPiLDX1GeuqdmzG', 'ADMIN', CURRENT_TIMESTAMP),
('Eliam User', 'eliam@coffeshop.com', '$2a$12$aF4mgD.WlvNcw9RogyoXNOyyDQ2dUv.V9v6uov7mGcdbTWg3pMmd2', 'USER', CURRENT_TIMESTAMP);
