<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<style>

:root {
  --tableBorder-color: rgb(99, 89, 0);
  --yellow-color: rgb(214, 166, 4);
  --lightYellow-color: rgb(153, 119, 2);
  --background-color: rgb(61, 61, 61);
  --tableBg-color: rgb(235, 235, 235);
}

body { 
  font-size: 140%; 
}

a {
  text-decoration: none;
  color: var(--yellow-color);
}

h2 {
  text-align: center;
  padding: 20px 0;
  color: rgb(255, 198, 4);
}

table caption {
  padding: .5em 0;
}

table.dataTable th,
table.dataTable td {
  white-space: nowrap;
}

#boardT th {
    text-align: center;
    color: var(--yellow-color);
    background-color: var(--background-color);
    border: none;
}

#boardT td {
    text-align: center;
    color: var(--lightYellow-color);
    background-color: var(--background-color);
    width: 20%;
    border: none;
}

#boardT th:first-child, td:first-child {
    text-align: left;
}

#boardT th:last-child, #table td:last-child {
    text-align: right;
}

#boardT {
	background-color: var(--background-color);
	border: 0.5px solid;
	border-color: var(--tableBorder-color);
}

#BoardForm input,
#BoardForm textarea {
	background-color: var(--tableBg-color);
	border: 0.5px solid;
}

#boardT {
	background-color: var(--background-color);
	border-collapse:collapse;
	border-right: none;
	border-left: none;
	border-top-color: var(--yellow-color);
	width: 100%;
}

.p {
  text-align: center;
  padding-top: 140px;
  font-size: 14px;
  color: rgb(255, 198, 4);
}

.page-number {
     display: inline-block;
     padding: 5px 10px; 
     border: 1px solid #333; 
 }

.selected {
    background-color: #333; 
    color: #fff;
}
 
.centered-pagination {
  text-align: center;
  display: block;
}

label {
  color: var(--yellow-color);
  font-weight: bold;
}

.container input:disabled, .container textarea:disabled {
    background-color: rgb(170, 170, 170);
    border-color: rgb(170, 170, 170); 
}

</style>