BEGIN TRANSACTION;
CREATE TABLE IF NOT EXISTS "nguoiDung" (
	"userName"	TEXT,
	"Password"	TEXT,
	"Phone"	TEXT,
	"hoTen"	TEXT,
	PRIMARY KEY("userName")
);
INSERT INTO "nguoiDung" VALUES ('hhhh','1223223','45334','Huy');
INSERT INTO "nguoiDung" VALUES ('ddd','w3333','t56546546','GGGG');
INSERT INTO "nguoiDung" VALUES ('AAA','3333','565645','NNN');
COMMIT;
