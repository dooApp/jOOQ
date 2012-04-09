
<?php 
// The following content has been XSL transformed from manual.xml using html-pages.xsl
// Please do not edit this content manually
require '../frame.php';
function getH1() {
    return "The jOOQ User Manual";
}
function getActiveMenu() {
	return "manual";
}
function getSlogan() {
	return "
			The manual is the central reference for most of jOOQ's functionality.
		";
}
function printContent() {
    global $root;
?>
<table width="100%" border="0" cellspacing="0" cellpadding="0">
<tr>
<td valign="top" align="left"><a href="<?=$root?>/manual/">The jOOQ User Manual</a></td><td style="white-space: nowrap" valign="top" align="right"><a title="Next section: jOOQ classes and their usage" href="<?=$root?>/manual/JOOQ/">next</a></td>
</tr>
</table>
			
				<h3>All manuals</h3>
				<ul>
					
<li>
<a href="<?=$root?>/manual-single-page" title="The jOOQ Manual on one single page">A single-paged HTML manual</a>
</li>
					
<li>
<a href="<?=$root?>/manual" title="The jOOQ Manual on multiple pages">A multi-paged HTML manual</a>
</li>
					
<li>
<a href="<?=$root?>/manual-pdf/jOOQ-manual.pdf" title="The jOOQ Manual as a PDF">A downloadable PDF manual</a>
</li>
				
</ul>
			
			<h3>Overview</h3>
			<p>This manual is divided into four main sections:</p>
			<ul>
				
<li>
					
<a href="<?=$root?>/manual/JOOQ/" title="jOOQ Manual reference: jOOQ classes and their usage">jOOQ classes and their usage</a>
					
<p>
						See these chapters for an overview of the jOOQ internal architecture
						and all types that are involved with jOOQ's query creation and
						execution. This is the important part for you, also, if you wish to
						extend jOOQ
					</p>
				
</li>
				
<li>
					
<a href="<?=$root?>/manual/META/" title="jOOQ Manual reference: Meta model code generation">Meta model code generation</a>
					
<p>
						See these chapters to understand how you can use jOOQ as a source code
						generator, and what type of artefacts are generated by jOOQ
					</p>
				
</li>
				
<li>
					
<a href="<?=$root?>/manual/DSL/" title="jOOQ Manual reference: DSL or fluent API. Where SQL meets Java">DSL or fluent API. Where SQL meets Java</a>
					
<p>
						See these chapters to learn about how to use jOOQ in every day's work. The
						jOOQ DSL is the main way to create and execute jOOQ queries almost as
						if SQL was embedded in Java directly
					</p>
				
</li>
				
<li>
					
<a href="<?=$root?>/manual/ADVANCED/" title="jOOQ Manual reference: Advanced topics">Advanced topics</a>
					
<p>
						Some advanced topics including not-everyday functionality
					</p>
				
</li>
			
</ul>
		<h3>Table of contents</h3><ol>
<li>
<a title="jOOQ classes and their usage" href="<?=$root?>/manual/JOOQ/">jOOQ classes and their usage</a>
<ol>
<li>
<a title="The example database" href="<?=$root?>/manual/JOOQ/ExampleDatabase/">The example database</a>
</li>
<li>
<a title="The Factory class" href="<?=$root?>/manual/JOOQ/Factory/">The Factory class</a>
</li>
<li>
<a title="Tables and Fields" href="<?=$root?>/manual/JOOQ/Table/">Tables and Fields</a>
</li>
<li>
<a title="Results and Records" href="<?=$root?>/manual/JOOQ/Result/">Results and Records</a>
</li>
<li>
<a title="Updatable Records" href="<?=$root?>/manual/JOOQ/UpdatableRecord/">Updatable Records</a>
</li>
<li>
<a title="The Query and its various subtypes" href="<?=$root?>/manual/JOOQ/Query/">The Query and its various subtypes</a>
</li>
<li>
<a title="ResultQuery and various ways of fetching data" href="<?=$root?>/manual/JOOQ/ResultQuery/">ResultQuery and various ways of fetching data</a>
</li>
<li>
<a title="Bind values" href="<?=$root?>/manual/JOOQ/BindValues/">Bind values</a>
</li>
<li>
<a title="QueryParts and the global architecture" href="<?=$root?>/manual/JOOQ/QueryPart/">QueryParts and the global architecture</a>
</li>
<li>
<a title="Serializability of QueryParts and Results" href="<?=$root?>/manual/JOOQ/Serializability/">Serializability of QueryParts and Results</a>
</li>
<li>
<a title="Extend jOOQ with custom types" href="<?=$root?>/manual/JOOQ/Extend/">Extend jOOQ with custom types</a>
</li>
</ol>
</li>
<li>
<a title="Meta model code generation" href="<?=$root?>/manual/META/">Meta model code generation</a>
<ol>
<li>
<a title="Configuration and setup of the generator" href="<?=$root?>/manual/META/Configuration/">Configuration and setup of the generator</a>
</li>
<li>
<a title="Advanced configuration of the generator" href="<?=$root?>/manual/META/AdvancedConfiguration/">Advanced configuration of the generator</a>
</li>
<li>
<a title="The schema, top-level generated artefact" href="<?=$root?>/manual/META/SCHEMA/">The schema, top-level generated artefact</a>
</li>
<li>
<a title="Tables, views and their corresponding records" href="<?=$root?>/manual/META/TABLE/">Tables, views and their corresponding records</a>
</li>
<li>
<a title="Procedures and packages" href="<?=$root?>/manual/META/PROCEDURE/">Procedures and packages</a>
</li>
<li>
<a title="UDT's including ARRAY and ENUM types" href="<?=$root?>/manual/META/UDT/">UDT's including ARRAY and ENUM types</a>
</li>
<li>
<a title="Sequences" href="<?=$root?>/manual/META/SEQUENCE/">Sequences</a>
</li>
</ol>
</li>
<li>
<a title="DSL or fluent API. Where SQL meets Java" href="<?=$root?>/manual/DSL/">DSL or fluent API. Where SQL meets Java</a>
<ol>
<li>
<a title="Complete SELECT syntax" href="<?=$root?>/manual/DSL/SELECT/">Complete SELECT syntax</a>
</li>
<li>
<a title="Table sources" href="<?=$root?>/manual/DSL/TABLESOURCE/">Table sources</a>
</li>
<li>
<a title="Conditions" href="<?=$root?>/manual/DSL/CONDITION/">Conditions</a>
</li>
<li>
<a title="Aliased tables and fields" href="<?=$root?>/manual/DSL/ALIAS/">Aliased tables and fields</a>
</li>
<li>
<a title="Nested SELECT using the IN operator" href="<?=$root?>/manual/DSL/IN/">Nested SELECT using the IN operator</a>
</li>
<li>
<a title="Nested SELECT using the EXISTS operator" href="<?=$root?>/manual/DSL/EXISTS/">Nested SELECT using the EXISTS operator</a>
</li>
<li>
<a title="Other types of nested SELECT" href="<?=$root?>/manual/DSL/NESTED/">Other types of nested SELECT</a>
</li>
<li>
<a title="UNION and other set operations" href="<?=$root?>/manual/DSL/UNION/">UNION and other set operations</a>
</li>
<li>
<a title="Functions and aggregate operators" href="<?=$root?>/manual/DSL/FUNCTIONS/">Functions and aggregate operators</a>
</li>
<li>
<a title="Stored procedures and functions" href="<?=$root?>/manual/DSL/PROCEDURES/">Stored procedures and functions</a>
</li>
<li>
<a title="Arithmetic operations and concatenation" href="<?=$root?>/manual/DSL/ARITHMETIC/">Arithmetic operations and concatenation</a>
</li>
<li>
<a title="The CASE clause" href="<?=$root?>/manual/DSL/CASE/">The CASE clause</a>
</li>
<li>
<a title="Type casting" href="<?=$root?>/manual/DSL/CAST/">Type casting</a>
</li>
<li>
<a title="When it's just easier: Plain SQL" href="<?=$root?>/manual/DSL/SQL/">When it's just easier: Plain SQL</a>
</li>
</ol>
</li>
<li>
<a title="Advanced topics" href="<?=$root?>/manual/ADVANCED/">Advanced topics</a>
<ol>
<li>
<a title="Master data generation. Enumeration tables" href="<?=$root?>/manual/ADVANCED/MasterData/">Master data generation. Enumeration tables</a>
</li>
<li>
<a title="Custom data types and type conversion" href="<?=$root?>/manual/ADVANCED/CustomTypes/">Custom data types and type conversion</a>
</li>
<li>
<a title="Mapping generated schemata and tables" href="<?=$root?>/manual/ADVANCED/SchemaMapping/">Mapping generated schemata and tables</a>
</li>
<li>
<a title="Execute listeners and the jOOQ Console" href="<?=$root?>/manual/ADVANCED/ExecuteListener/">Execute listeners and the jOOQ Console</a>
</li>
<li>
<a title="Adding Oracle hints to queries" href="<?=$root?>/manual/ADVANCED/OracleHints/">Adding Oracle hints to queries</a>
</li>
<li>
<a title="The Oracle CONNECT BY clause" href="<?=$root?>/manual/ADVANCED/CONNECTBY/">The Oracle CONNECT BY clause</a>
</li>
<li>
<a title="The Oracle 11g PIVOT clause" href="<?=$root?>/manual/ADVANCED/PIVOT/">The Oracle 11g PIVOT clause</a>
</li>
<li>
<a title="jOOQ's relational division syntax" href="<?=$root?>/manual/ADVANCED/DIVISION/">jOOQ's relational division syntax</a>
</li>
<li>
<a title="Exporting to XML, CSV, JSON, HTML, Text" href="<?=$root?>/manual/ADVANCED/Export/">Exporting to XML, CSV, JSON, HTML, Text</a>
</li>
<li>
<a title="Importing data from XML, CSV" href="<?=$root?>/manual/ADVANCED/Import/">Importing data from XML, CSV</a>
</li>
<li>
<a title="Using JDBC batch operations" href="<?=$root?>/manual/ADVANCED/Batch/">Using JDBC batch operations</a>
</li>
</ol>
</li>
</ol><br><table width="100%" border="0" cellspacing="0" cellpadding="0">
<tr>
<td valign="top" align="left"><a href="<?=$root?>/manual/">The jOOQ User Manual</a></td><td style="white-space: nowrap" valign="top" align="right"><a title="Next section: jOOQ classes and their usage" href="<?=$root?>/manual/JOOQ/">next</a></td>
</tr>
</table>
<?php 
}
?>

