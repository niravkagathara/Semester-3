document.write(" calculator two number +,-,*,/");
c = parseInt(prompt("enter 1 to sum ,2 to sub , 3 to malti ,4 to divi  "));
document.write(" <br/> enter 1 to sum ,2 to sub , 3 to malti ,4 to divi =" + c);
a = parseInt(prompt("enter frist  number : "));
document.write("<br/> first number is : =" + a);
b = parseInt(prompt("enter second  number : "));
document.write("<br/> second number is :=" + b);

switch (c) {
    case 1:
        document.write("<br/> ans="+(a+b));
        break;

    case 2:
        document.write("<br/> ans="+(a-b));
        break;

    case 3:
        document.write("<br/> ans="+(a*b));
        break;

    case 4:
        document.write("<br/> ans="+(a/b));
        break;

    default:
        document.write("<br/> not found");
        break;

}