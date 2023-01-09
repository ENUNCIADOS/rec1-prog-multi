# CreditCardApp

## Main Activity (3 puntos)

Modifica la actividad principal para añadir un RecyclerView de tarjetas de crédito (CreditCard):
- Define un layout para cada tarjeta:
  - Se deben mostrar todos los campos de la tarjeta
  - Añade un botón con el texto "Eliminar"
- Modificar CreditCardAdapter de forma que acepte una lista de tarjetas (List<CreditCard>)
- Modifica MainActivity para que el RecyclerView use el CreditCardAdapter:
  - Carga los datos que hay en MainActivity
  - Haz que las tarjetas aparezcan en filas de una columna
  - Encima del RecyclerView pon un botón "Añadir"

## AddCreditCardActivity (3 puntos)

Crea una actividad que permitea meter los datos de una tarjeta de crédito:
  - Utiliza ConstraintLayout
  - Coloca los EditText alinéados
  - En la parte inferior de la pantalla, pon dos botones uno al lado del otro:
    - Aceptar
    - Cancelar