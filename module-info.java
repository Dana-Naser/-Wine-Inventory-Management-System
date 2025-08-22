module FinalCheers {
    requires java.desktop;
    requires java.sql;
    requires hsqldb;
	requires java.xml;
	requires jasperreports;
	requires json.simple; // דרישה עבור HSQLDB

    exports boundaryy;
    exports control;
    exports entity;
}
