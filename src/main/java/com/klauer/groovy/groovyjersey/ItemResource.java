 p a c k a g e   c o m . k l a u e r . g r o o v y . g r o o v y j e r s e y ; 
 
 i m p o r t   j a v a x . w s . r s . c o r e . C o n t e x t ; 
 i m p o r t   j a v a x . w s . r s . c o r e . U r i I n f o ; 
 i m p o r t   j a v a x . w s . r s . G E T ; 
 i m p o r t   j a v a x . w s . r s . P U T ; 
 i m p o r t   j a v a x . w s . r s . P r o d u c e s ; 
 i m p o r t   j a v a x . w s . r s . D E L E T E ; 
 i m p o r t   j a v a x . w s . r s . P a t h P a r a m ; 
 i m p o r t   j a v a x . w s . r s . C o n s u m e s ; 
 
 / * * 
   *   R E S T   W e b   S e r v i c e 
   * 
   *   @ a u t h o r   k l a u e r 
   * / 
 
 p u b l i c   c l a s s   I t e m R e s o u r c e   { 
         @ C o n t e x t 
         p r i v a t e   U r i I n f o   c o n t e x t ; 
 
         / * *   C r e a t e s   a   n e w   i n s t a n c e   o f   I t e m R e s o u r c e   * / 
         p u b l i c   I t e m R e s o u r c e ( )   { 
         } 
 
         / * * 
           *   R e t r i e v e s   r e p r e s e n t a t i o n   o f   a n   i n s t a n c e   o f   c o m . k l a u e r . g r o o v y . g r o o v y j e r s e y . I t e m R e s o u r c e 
           *   @ p a r a m   i d   r e s o u r c e   U R I   p a r a m e t e r 
           *   @ r e t u r n   a n   i n s t a n c e   o f   j a v a . l a n g . S t r i n g 
           * / 
         @ G E T 
         @ P r o d u c e s ( " a p p l i c a t i o n / x m l " ) 
         p u b l i c   S t r i n g   g e t X m l ( @ P a t h P a r a m ( " i d " ) 
         S t r i n g   i d )   { 
                 / / T O D O   r e t u r n   p r o p e r   r e p r e s e n t a t i o n   o b j e c t 
                 t h r o w   n e w   U n s u p p o r t e d O p e r a t i o n E x c e p t i o n ( ) ; 
         } 
 
         / * * 
           *   P U T   m e t h o d   f o r   u p d a t i n g   o r   c r e a t i n g   a n   i n s t a n c e   o f   I t e m R e s o u r c e 
           *   @ p a r a m   i d   r e s o u r c e   U R I   p a r a m e t e r 
           *   @ p a r a m   c o n t e n t   r e p r e s e n t a t i o n   f o r   t h e   r e s o u r c e 
           *   @ r e t u r n   a n   H T T P   r e s p o n s e   w i t h   c o n t e n t   o f   t h e   u p d a t e d   o r   c r e a t e d   r e s o u r c e . 
           * / 
         @ P U T 
         @ C o n s u m e s ( " a p p l i c a t i o n / x m l " ) 
         p u b l i c   v o i d   p u t X m l ( @ P a t h P a r a m ( " i d " ) 
         S t r i n g   i d ,   S t r i n g   c o n t e n t )   { 
         } 
 
         / * * 
           *   D E L E T E   m e t h o d   f o r   r e s o u r c e   I t e m R e s o u r c e 
           *   @ p a r a m   i d   r e s o u r c e   U R I   p a r a m e t e r 
           * / 
         @ D E L E T E 
         p u b l i c   v o i d   d e l e t e ( @ P a t h P a r a m ( " i d " ) 
         S t r i n g   i d )   { 
         } 
 } 
