
package mycalc;
import java.util.* ; 

/**
 *
 * @author brandon rupert <barupert@gmail.com>
 * @version 1.0 
 */
public class MyCalcUI extends javax.swing.JFrame {
    
    public String rawInfix, oldExpr, newExpr, ansText ; 
    public String fmtInfix, postfix ; 
    //negative sign read internally as single underscore, 
    //not to be confused with underscore as cursor in UI display
    //P is pi, e is e, replaced in postfix eval with the numbers 
    public String numerics = ".01234567890_P" ; 
    public String binaryOps = "-^/X+"; 

    
    
    
    boolean noErrors = true ; 
    int cursorPos = 0 ; 
    int oldCursorPos = 0 ;
    int symbLen = 0 ; 

    /**
     * Creates new form MyCalcUI
     */
    public MyCalcUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exprScrn = new javax.swing.JLabel();
        ansScrn = new javax.swing.JLabel();
        errScrn = new javax.swing.JLabel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnNeg = new javax.swing.JButton();
        btnPnt = new javax.swing.JButton();
        btnEql = new javax.swing.JButton();
        btnClr = new javax.swing.JButton();
        btnPls = new javax.swing.JButton();
        btnMin = new javax.swing.JButton();
        bnMul = new javax.swing.JButton();
        btnDiv = new javax.swing.JButton();
        btnPwr = new javax.swing.JButton();
        btnLPar = new javax.swing.JButton();
        btnRPar = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        btnPi = new javax.swing.JButton();
        btnExp = new javax.swing.JButton();
        btnPw10 = new javax.swing.JButton();
        btnLCur = new javax.swing.JButton();
        btnRCur = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        exprScrn.setText("_");
        exprScrn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ansScrn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        errScrn.setForeground(new java.awt.Color(255, 51, 51));
        errScrn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errScrn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setText("4");
        btn4.setSize(new java.awt.Dimension(97, 25));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btnNeg.setText("(-)");
        btnNeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNegActionPerformed(evt);
            }
        });

        btnPnt.setText(".");
        btnPnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPntActionPerformed(evt);
            }
        });

        btnEql.setText("=");
        btnEql.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEqlActionPerformed(evt);
            }
        });

        btnClr.setText("Clear");
        btnClr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClrActionPerformed(evt);
            }
        });

        btnPls.setText("+");
        btnPls.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlsActionPerformed(evt);
            }
        });

        btnMin.setText("-");
        btnMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinActionPerformed(evt);
            }
        });

        bnMul.setText("X");
        bnMul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnMulActionPerformed(evt);
            }
        });

        btnDiv.setText("/");
        btnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivActionPerformed(evt);
            }
        });

        btnPwr.setText("^");
        btnPwr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPwrActionPerformed(evt);
            }
        });

        btnLPar.setText("(");
        btnLPar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLParActionPerformed(evt);
            }
        });

        btnRPar.setText(")");
        btnRPar.setToolTipText("");
        btnRPar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRParActionPerformed(evt);
            }
        });

        btnDel.setText("Delete");
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        btnPi.setText("Pi");
        btnPi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPiActionPerformed(evt);
            }
        });

        btnExp.setText("e^");
        btnExp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExpActionPerformed(evt);
            }
        });

        btnPw10.setText("10^");
        btnPw10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPw10ActionPerformed(evt);
            }
        });

        btnLCur.setText("<");
        btnLCur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLCurActionPerformed(evt);
            }
        });

        btnRCur.setText(">");
        btnRCur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRCurActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(exprScrn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ansScrn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(btn1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(btnNeg, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnPnt, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnPls, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bnMul, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(btnPwr, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(btnRPar, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(btnMin, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnLPar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(btnPi, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnExp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnDel, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnLCur, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnRCur, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnPw10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(errScrn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnClr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEql, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(exprScrn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(errScrn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ansScrn, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1)
                    .addComponent(btn2)
                    .addComponent(btn3)
                    .addComponent(btnEql)
                    .addComponent(btnPls)
                    .addComponent(btnMin))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(btn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClr)
                    .addComponent(bnMul)
                    .addComponent(btnDiv))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn7)
                    .addComponent(btn8)
                    .addComponent(btn9)
                    .addComponent(btnPwr)
                    .addComponent(btnLPar)
                    .addComponent(btnDel)
                    .addComponent(btnLCur)
                    .addComponent(btnRCur))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn0)
                    .addComponent(btnNeg)
                    .addComponent(btnPnt)
                    .addComponent(btnRPar)
                    .addComponent(btnPi)
                    .addComponent(btnExp)
                    .addComponent(btnPw10))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean isNum( String strIn){
        // if a single character in the string
        // is non-numeric return False 
        String[] eachChar  ;
        eachChar = strIn.split("") ; 
        for( int i  =0 ; i < eachChar.length; i++){
            if ( !numerics.contains( eachChar[i]) ) {
                        return false ; 
                    }
        }
        return true  ;
    }
    private boolean notNum( String strIn){
        // if a single character in substring is
        // numeric, return false 
        String[] eachChar ; 
        eachChar = strIn.split("") ; 
        for( int i = 0; i < eachChar.length; i++){
            if ( numerics.contains( eachChar[i])){
                return false; 
            }
        }
        return true  ; 
    }
    //A means of allowing multi-digit numbers and 
    //decimals and signed numbers in infix to postfix conversion, 
    //wrap operators in square brackets and numbers in braces 
    private String fmtInfix(String rawInfix ){
        if ( rawInfix.length()  == 1 ){
            return rawInfix ; 
        }
        String fmted = "" ; 
        String prevLetter, currLetter ;
        currLetter = rawInfix.substring(0,1) ; 
        if ( isNum( currLetter)){
            fmted = fmted + "{" + currLetter ;  
        }
        else{
            fmted = fmted + "[" + currLetter ; 
        }
        for( int i=1; i < rawInfix.length() -1 ; i++){
            prevLetter = rawInfix.substring(i-1,i) ; 
            currLetter = rawInfix.substring(i, i+1) ; 
            
            if( notNum(prevLetter) && isNum(currLetter) ){
                fmted=fmted+"]{" + currLetter ;
            }
            else if( isNum(prevLetter) && notNum(currLetter)){
                fmted = fmted+"}[" + currLetter ; 
            }
            else if( isNum(prevLetter) && isNum(currLetter)){
                fmted = fmted + currLetter ; 
            }
            else{
                fmted = fmted + "][" + currLetter ; 
            }
        }
        currLetter = rawInfix.substring( rawInfix.length() -1,
                rawInfix.length() );
        prevLetter = rawInfix.substring( rawInfix.length() -2, 
                rawInfix.length() -1 ) ;
        if ( isNum( currLetter) && notNum( prevLetter ) ){
            fmted = fmted +"]{"+ currLetter + "}" ;
        }
        else if( isNum(currLetter)&& isNum(prevLetter)){
            fmted=fmted+currLetter + "}" ; 
        }
        else if(notNum(currLetter)&& isNum(prevLetter)){
            fmted=fmted+"}["+ currLetter +"]" ; 
        }
        else{
            fmted = fmted+"][" +currLetter +"]" ; 
        }
        return fmted ; 
    }
    
    //Thanks to the discussion & explanation in 
    //http://interactivepython.org/runestone/static/pythonds/BasicDS/InfixPrefixandPostfixExpressions.html
    //I took the approach there, allowed decimal operations and multi-digit
    //numbers, as well as negative numbers and exponents in the infix-conversion
    //and postfix evaluations. And then I put it all in Java 
    //Replace brackets & braces with spaces, then take tokens into standard
    //postfix 
    private String toPostfix( String fmtedInfix){
        if ( fmtedInfix.length() == 1){
            return fmtedInfix ; 
        }
        Map<String,Integer> prefs = new HashMap<String,Integer>() ; 
        Deque<String> postfix = new ArrayDeque<String>() ; 
        Deque<String> opers = new ArrayDeque<String>() ; 
        Deque<String> readyPostfix = new ArrayDeque<String>() ; 
        prefs.put("X",3);
        prefs.put("/",3);
        prefs.put("+",2);
        prefs.put("-",2);
        prefs.put("(", 0);
        prefs.put(")", 0) ;
        prefs.put("^",1) ;

        String postfixOut, token, topToken  ; 
        postfixOut ="" ; 
        String infix ; 
        String[] splitInfix ; 
        infix = fmtedInfix.replace("[", " ");
        infix = infix.replace("]", " ") ;
        infix = infix.replace("{", " ") ; 
        infix = infix.replace("}", " ") ; 
        infix = infix.trim() ; 

        splitInfix = infix.split("\\s+") ;


        for( int i = 0 ; i < splitInfix.length; i++){
            token = splitInfix[i] ; 

            if ( isNum(token)){
                postfix.push(token);

            }
            else if( token.equals("(")){
                opers.push(token);

            }
            else if( token.equals(")")){
                topToken = opers.pop() ; 
                while ( !topToken.equals("(")){

                    postfix.push(topToken);
                    topToken = opers.pop() ; 
                }
            }
            else{
 
                while(  ( opers.size() != 0) &&
                        ( prefs.get(opers.peekLast()) >= prefs.get(token))

                        ){
                        postfix.push( opers.pop() );
                }
                opers.push(token);
            }
        }

        while( opers.size() != 0 )
        {
            postfix.push(opers.pop());
        }
        while ( postfix.size() != 0 ){
            readyPostfix.push( postfix.pop() );
             
        }
        while (readyPostfix.size() != 0){
            postfixOut += " " + readyPostfix.pop() ;
        }
        return postfixOut ; 

    
    }
    //postfix evaluation, careful to check for division by 0 and unreal
    //Any errors not caught here tend to be NumberFormatException or 
    //NoSuchElement exception; I use a try-catch block in the 
    //method that ultimately calls this, to handle those such errors. 
    private String fPostfix( String token, float op1, float op2){
        if ( token.equals("X")){
            return String.format("%f", op1*op2) ; 
        }
        else if( token.equals("/")){
            if( op2 == 0.0 ){
                return "divide0" ; 
            }
            return String.format("%f", op1/op2) ; 
        }
        else if( token.equals("+")){
            return String.format("%f", op1 + op2) ;
        }
        else if( token.equals("^")){
            if ( ( op2 < 0.0 ) && ( op1 == 0.0)){
                return "divide0";
            }
            else if( (op1 < 0) &&  ( (int)( 1/op2)%2 == 0 ) ){
                return "unreal" ; 
            }
            else{
                return String.format("%f", Math.pow(op1, op2)) ;
            }
        }
        else if( token.equals("-")){
            return String.format("%f", op1 - op2) ; 
        }
        
        else{
           return "unknownOp" ; 
        }
        
    }
    
    private String evalPostfix( String postfix)
    {
        if( ( postfix.length() ==1 ) && ( isNum( postfix))){
        return postfix ; 
        }
    
        String token , ans, result ; 
        float value, op1, op2 ; 
        Deque<Float> opers = new ArrayDeque<Float>() ;
        postfix = postfix.trim() ; 
        String[] tokens = postfix.split("\\s+") ; 
 
        for( int i = 0; i < tokens.length ; i++ ){
            token = tokens[i];
            if ( !notNum( token) ){
                if ( token.substring(0,1).equals("_") ){
                    token = token.replace("_"," ");
                    value = Float.parseFloat(token); 
                    opers.push( -value);
                }
                else if( token.contains("_") 
                        && (!token.substring(0,1).equals("_"))){
                    return "bad negative" ; 
                }
                else if(token.equals("P")){
                    value = (float)Math.PI; 
                    opers.push(value); 
                }

                else{
                    value = Float.parseFloat(token) ; 
                    opers.push(value);
                }
            }
            else{
                op2 = opers.pop() ; 
                op1 = opers.pop() ; 
                result = fPostfix( token, op1, op2) ; 
                //divide0 unreal unknownOp
                if ( result.equals("divide0") || result.equals("unreal")||
                        result.equals("unkownOp")){
                    return result ; 
                }
                value = Float.parseFloat(result ) ; 
                opers.push(value );
            }
        }
        if ( opers.size() != 1){
            return "syntaxError" ; 
        }
        return String.valueOf(opers.pop() ); 
    }
    //adding to the input window, takes 
    //adjustement of substrings 
    private void addSymbol( String symbol )
    {
        symbLen = symbol.length() ; 
        oldExpr = exprScrn.getText() ; 
        if ( cursorPos == 0 ){
            newExpr = symbol + oldExpr ;
        }
        else{
            newExpr = oldExpr.substring(0, cursorPos) + symbol +
                    oldExpr.substring(cursorPos, oldExpr.length()) ;
        }
        exprScrn.setText(newExpr) ; 

        oldCursorPos = cursorPos ; 
        cursorPos += symbLen ; 
    }
    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed

        addSymbol("2") ; 
    }//GEN-LAST:event_btn2ActionPerformed

    private void btnPiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPiActionPerformed

        addSymbol("Pi") ; 
    }//GEN-LAST:event_btnPiActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
 
        addSymbol("1") ; 
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
  
        addSymbol("3") ; 
    }//GEN-LAST:event_btn3ActionPerformed

    private void btnPlsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlsActionPerformed
    
        addSymbol("+") ; 
    }//GEN-LAST:event_btnPlsActionPerformed

    private void btnMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinActionPerformed
   
        addSymbol("-") ; 
    }//GEN-LAST:event_btnMinActionPerformed

    private void btnEqlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEqlActionPerformed

        // input not checked yet
        noErrors=true ; 
        // Trim and replace UI syntax with math syntax 
        rawInfix = exprScrn.getText().trim() ; 
        // if only cursor is left, do not continue
        if ( rawInfix.equals("_")){
            return ; 
        }
        // Remove cursor 
        rawInfix = rawInfix.replace("_", "") ; 
        rawInfix = rawInfix.replace("Pi", "P" ) ;
        rawInfix = rawInfix.replace("e", String.valueOf(Math.E)) ;

        // Expressing negative by prefixed underscore _
        rawInfix = rawInfix.replace( "(-)", "_"); 
        if ((rawInfix.length() > 1 ) && ( binaryOps.contains( rawInfix.substring(0,1) ) 
                || binaryOps.contains( rawInfix.substring(rawInfix.length()-1,
                                                            rawInfix.length())
                ))){
            noErrors = false; 
            errScrn.setText("syntaxError");
            return  ; 
            
            
        }
        
        
            
        if(( rawInfix.length() == 1 ) && ( ( notNum(rawInfix))  )){
            noErrors = false ; 
            errScrn.setText("syntaxError") ; 
            return ; 
        }
        if ( rawInfix.equals( "_") )
        {
            noErrors = false ; 
            errScrn.setText("syntaxError") ; 
            return ; 
        }
        
        
        
        if( noErrors){
            try{
         ansText = evalPostfix(toPostfix(fmtInfix(rawInfix))) ; 
            }
            catch (NumberFormatException e){
                errScrn.setText("syntaxError") ; 
                return ; 
            }
            catch (NoSuchElementException e){
                errScrn.setText("syntaxError") ; 
                return ; 
            }
        }

        if ( ansText.equals("divide0") || ansText.equals("syntaxError") ||
                ansText.equals("bad negative") ||
                ansText.equals("unreal") ||
                ansText.equals("unknownOp")){
            noErrors = false ; 
        }
        // Run it through ; will Try and might print 
        if ( noErrors ){
            
            ansScrn.setText(ansText ); 
        }
        else
        {
            //exprScrn.setText("_");
            ansScrn.setText("");
            newExpr = "" ; 
            rawInfix = "" ; 
            errScrn.setText("") ; 
            cursorPos = 0 ; 
            oldCursorPos = cursorPos ; 
            errScrn.setText(ansText) ; 
            
        }
        
    }//GEN-LAST:event_btnEqlActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
 
        addSymbol("4") ; 
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed

        addSymbol("5") ; 
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
  
        addSymbol("6") ; 
    }//GEN-LAST:event_btn6ActionPerformed

    private void bnMulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnMulActionPerformed
    
        addSymbol("X") ; 
    }//GEN-LAST:event_bnMulActionPerformed

    private void btnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivActionPerformed
      
        addSymbol("/") ; 
    }//GEN-LAST:event_btnDivActionPerformed

    private void btnClrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClrActionPerformed
 
        //clear all
        exprScrn.setText("_");
        ansScrn.setText("");
        ansText = "" ; 
        newExpr = "" ; 
        rawInfix = "" ; 
        errScrn.setText("") ; 
        cursorPos = 0 ; 
        oldCursorPos = cursorPos ; 
        noErrors = true ; 
        
    }//GEN-LAST:event_btnClrActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed

        addSymbol("7") ; 
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
  
        addSymbol("8") ; 
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
   
        addSymbol("9") ; 
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnPwrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPwrActionPerformed
  
        addSymbol("^") ; 
    }//GEN-LAST:event_btnPwrActionPerformed

    private void btnLParActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLParActionPerformed
      
        addSymbol("(") ; 
    }//GEN-LAST:event_btnLParActionPerformed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        //delete character prior to cursor, do nothing  if at left margin
        oldExpr = exprScrn.getText() ;
        oldCursorPos = cursorPos ; 
        ansScrn.setText(""); 
        errScrn.setText("") ; 
        if ( cursorPos > 1 ) {
            newExpr = oldExpr.substring(0, cursorPos-1) + "_" 
                    + oldExpr.substring(cursorPos+1, oldExpr.length());
            exprScrn.setText( newExpr );
            cursorPos -- ; 
            
        }
        else{ 
        
            newExpr = "_" + oldExpr.substring(cursorPos+1, oldExpr.length());
            exprScrn.setText(newExpr) ; 

            cursorPos = 0 ;
        }
    

        
        
        
    }//GEN-LAST:event_btnDelActionPerformed

    private void btnLCurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLCurActionPerformed
        //advance cursor to left in input screen 
        if (cursorPos > 0 ){ 
            oldExpr = exprScrn.getText() ; 
            oldCursorPos = cursorPos ; 
            newExpr = oldExpr.substring(0,cursorPos -1 ) +"_"
                    + oldExpr.substring(cursorPos -1, oldExpr.length());
            cursorPos -- ; 
            newExpr = newExpr.substring(0, oldCursorPos + 1)
                    + newExpr.substring(oldCursorPos + 2, 
                            newExpr.length()) ; 
            exprScrn.setText(newExpr); 
        }
        
        
    }//GEN-LAST:event_btnLCurActionPerformed

    private void btnRCurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRCurActionPerformed
        //advance cursor to right in input screen 
        oldExpr = exprScrn.getText() ; 
        if (cursorPos < ( oldExpr.length() -1 )){
            oldCursorPos = cursorPos ; 
            newExpr = oldExpr.substring(0, cursorPos ) 
                    + oldExpr.substring(cursorPos+1, cursorPos+2) 
                    + "_" 
                    + oldExpr.substring(cursorPos+2, oldExpr.length()) ;
            cursorPos++ ; 
            exprScrn.setText(newExpr); 
        }
       
    }//GEN-LAST:event_btnRCurActionPerformed

    private void btnNegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNegActionPerformed

        addSymbol("(-)") ; 
    }//GEN-LAST:event_btnNegActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed

        addSymbol("0") ; 
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnPntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPntActionPerformed

        addSymbol(".") ; 
    }//GEN-LAST:event_btnPntActionPerformed

    private void btnRParActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRParActionPerformed

        addSymbol(")") ; 
    }//GEN-LAST:event_btnRParActionPerformed

    private void btnExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExpActionPerformed
      
        addSymbol("e^(") ; 
    }//GEN-LAST:event_btnExpActionPerformed

    private void btnPw10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPw10ActionPerformed

        addSymbol("10^(") ; 
    }//GEN-LAST:event_btnPw10ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MyCalcUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyCalcUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyCalcUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyCalcUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyCalcUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ansScrn;
    private javax.swing.JButton bnMul;
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnClr;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnDiv;
    private javax.swing.JButton btnEql;
    private javax.swing.JButton btnExp;
    private javax.swing.JButton btnLCur;
    private javax.swing.JButton btnLPar;
    private javax.swing.JButton btnMin;
    private javax.swing.JButton btnNeg;
    private javax.swing.JButton btnPi;
    private javax.swing.JButton btnPls;
    private javax.swing.JButton btnPnt;
    private javax.swing.JButton btnPw10;
    private javax.swing.JButton btnPwr;
    private javax.swing.JButton btnRCur;
    private javax.swing.JButton btnRPar;
    private javax.swing.JLabel errScrn;
    private javax.swing.JLabel exprScrn;
    // End of variables declaration//GEN-END:variables
}
