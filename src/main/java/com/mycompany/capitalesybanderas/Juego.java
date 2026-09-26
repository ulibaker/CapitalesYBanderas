package com.mycompany.capitalesybanderas;
import java.awt.Font;
import java.awt.Image;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.ImageIcon;
/**
 *
 * @author uli
 */
public class Juego extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Juego.class.getName());

    private Map<Character, List<String>> dictionary;
    HashMap<Integer, String[]> mapaBanderas = new HashMap<>();
    private Generador<Integer> genBanderas;
    private int num = 0;
    
    public Juego() {
        initComponents();
        CBtn.registerKeyboardAction(
            e -> {
                NBtn.doClick();
                CBtn.doClick();
                TFld1.requestFocusInWindow();
                WLbl.setVisible(false);
            },
            javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, 0),
            javax.swing.JComponent.WHEN_IN_FOCUSED_WINDOW
        );
        FlagLbl.setFont(new Font("Microsoft YaHei", Font.PLAIN, 250));   
        setLocationRelativeTo(null);
        setTitle("Capitales y Banderas!");
        getContentPane().setBackground(new java.awt.Color(255, 255, 255));
        ImageIcon icono = new ImageIcon(getClass().getClassLoader().getResource("0.png"));
        setIconImage(icono.getImage());
        
        mapaBanderas.put(1, new String[]{"Afganistan", "Kabul"});
        mapaBanderas.put(2, new String[]{"Albania", "Tirana"});
        mapaBanderas.put(3, new String[]{"Alemania", "Berlin"});
        mapaBanderas.put(4, new String[]{"Andorra", "Andorra la Vella"});
        mapaBanderas.put(5, new String[]{"Angola", "Luanda"});
        mapaBanderas.put(6, new String[]{"Antigua y Barbuda", "Saint Jhon's"});
        mapaBanderas.put(7, new String[]{"Arabia Saudita", "Riyad"});
        mapaBanderas.put(8, new String[]{"Argelia", "Argel"});
        mapaBanderas.put(9, new String[]{"Argentina", "Buenos Aires"});
        mapaBanderas.put(10, new String[]{"Armenia", "Erevan"});
        mapaBanderas.put(11, new String[]{"Australia", "Canberra"});
        mapaBanderas.put(12, new String[]{"Austria", "Viena"});
        mapaBanderas.put(13, new String[]{"Azerbaiyan", "Baku"});
        mapaBanderas.put(14, new String[]{"Bahamas", "Nasau"});
        mapaBanderas.put(15, new String[]{"Bahrein", "Manama"});
        mapaBanderas.put(16, new String[]{"Bangladesh", "Daca"});
        mapaBanderas.put(17, new String[]{"Barbados", "Bridgetown"});
        mapaBanderas.put(18, new String[]{"Belgica", "Bruselas"});
        mapaBanderas.put(19, new String[]{"Belice", "Belmopan"});
        mapaBanderas.put(20, new String[]{"Benin", "Porto Novo"});
        mapaBanderas.put(21, new String[]{"Bielorrusia", "Minsk"});
        mapaBanderas.put(22, new String[]{"Bolivia", "La Paz, Sucre"});
        mapaBanderas.put(23, new String[]{"Bosnia y Herzegovina", "Sarajevo"});
        mapaBanderas.put(24, new String[]{"Botswana", "Gaborone"});
        mapaBanderas.put(25, new String[]{"Brasil", "Brasilia"});
        mapaBanderas.put(26, new String[]{"Brunei", "Bandar Seri Begawan"});
        mapaBanderas.put(27, new String[]{"Bulgaria", "Sofia"});
        mapaBanderas.put(28, new String[]{"Burkina Faso", "Uagadugu"});
        mapaBanderas.put(29, new String[]{"Burundi", "Gitega"});
        mapaBanderas.put(30, new String[]{"Butan", "Timbu"});
        mapaBanderas.put(31, new String[]{"Cabo Verde", "Praia"});
        mapaBanderas.put(32, new String[]{"Camboya", "Nom Pen"});
        mapaBanderas.put(33, new String[]{"Camerun", "Yaunde"});
        mapaBanderas.put(34, new String[]{"Canada", "Ottawa"});
        mapaBanderas.put(35, new String[]{"Catar", "Doha"});
        mapaBanderas.put(36, new String[]{"Chad", "Yamena"});
        mapaBanderas.put(37, new String[]{"Chequia", "Praga"});
        mapaBanderas.put(38, new String[]{"Chile", "Santiago"});
        mapaBanderas.put(39, new String[]{"China", "Pekin"});
        mapaBanderas.put(40, new String[]{"Chipre", "Nicosia"});
        mapaBanderas.put(41, new String[]{"Colombia", "Bogota"});
        mapaBanderas.put(42, new String[]{"Comoras", "Moroni"});
        mapaBanderas.put(43, new String[]{"Congo", "Brazzaville"});
        mapaBanderas.put(44, new String[]{"Corea", "Seul"});
        mapaBanderas.put(45, new String[]{"Corea del Norte", "Pyongyang"});
        mapaBanderas.put(46, new String[]{"Costa de Marfil", "Yamoussoukro"});
        mapaBanderas.put(47, new String[]{"Costa Rica", "San Jose"});
        mapaBanderas.put(48, new String[]{"Croacia", "Zagreb"});
        mapaBanderas.put(49, new String[]{"Cuba", "La Habana"});
        mapaBanderas.put(50, new String[]{"Dinamarca", "Copenhague"});
        mapaBanderas.put(51, new String[]{"Dominica", "Roseau"});
        mapaBanderas.put(52, new String[]{"Ecuador", "Quito"});
        mapaBanderas.put(53, new String[]{"Egipto", "El Cairo"});
        mapaBanderas.put(54, new String[]{"El Salvador", "San Salvador"});
        mapaBanderas.put(55, new String[]{"Emiratos Arabes Unidos", "Abu Dabi"});
        mapaBanderas.put(56, new String[]{"Eritrea", "Asmara"});
        mapaBanderas.put(57, new String[]{"Eslovaquia", "Bratislava"});
        mapaBanderas.put(58, new String[]{"Eslovenia", "Liubliana"});
        mapaBanderas.put(59, new String[]{"España", "Madrid"});
        mapaBanderas.put(60, new String[]{"Estados Unidos", "Washington D. C."});
        mapaBanderas.put(61, new String[]{"Estonia", "Talin"});
        mapaBanderas.put(62, new String[]{"Esuatini", "Lobamba, Mbabane"});
        mapaBanderas.put(63, new String[]{"Etiopia", "Adis Abeba"});
        mapaBanderas.put(64, new String[]{"Fiji", "Suva"});
        mapaBanderas.put(65, new String[]{"Filipinas", "Manila"});
        mapaBanderas.put(66, new String[]{"Finlandia", "Helsinki"});
        mapaBanderas.put(67, new String[]{"Francia", "París"});
        mapaBanderas.put(68, new String[]{"Gabon", "Libreville"});
        mapaBanderas.put(69, new String[]{"Gambia", "Banjul"});
        mapaBanderas.put(70, new String[]{"Georgia", "Tifilis"});
        mapaBanderas.put(71, new String[]{"Ghana", "Acra"});
        mapaBanderas.put(72, new String[]{"Granada", "Saint Georges"});
        mapaBanderas.put(73, new String[]{"Grecia", "Atenas"});
        mapaBanderas.put(74, new String[]{"Guatemala", "Ciudad de Guatemala"});
        mapaBanderas.put(75, new String[]{"Guinea", "Conakri"});
        mapaBanderas.put(76, new String[]{"Guinea Bissau", "Bissau"});
        mapaBanderas.put(77, new String[]{"Guinea Ecuatorial", "Ciudad de la Paz"});
        mapaBanderas.put(78, new String[]{"Guyana", "Georgetown"});
        mapaBanderas.put(79, new String[]{"Haiti", "Puerto Príncipe"});
        mapaBanderas.put(80, new String[]{"Honduras", "Distrito Central"});
        mapaBanderas.put(81, new String[]{"Hungria", "Budapest"});
        mapaBanderas.put(82, new String[]{"India", "Nueva Delhi"});
        mapaBanderas.put(83, new String[]{"Indonesia", "Yakarta"});
        mapaBanderas.put(84, new String[]{"Iran", "Teheran"});
        mapaBanderas.put(85, new String[]{"Iraq", "Bagdad"});
        mapaBanderas.put(86, new String[]{"Irlanda", "Dublin"});
        mapaBanderas.put(87, new String[]{"Islandia", "Reikiavik"});
        mapaBanderas.put(88, new String[]{"Islas Marshall", "Majuro"});
        mapaBanderas.put(89, new String[]{"Islas Salomon", "Honiara"});
        mapaBanderas.put(90, new String[]{"Israel", "Jerusalen"});
        mapaBanderas.put(91, new String[]{"Italia", "Roma"});
        mapaBanderas.put(92, new String[]{"Jamaica", "Kingston"});
        mapaBanderas.put(93, new String[]{"Japon", "Tokio"});
        mapaBanderas.put(94, new String[]{"Jordania", "Amman"});
        mapaBanderas.put(95, new String[]{"Kazajstan", "Astana"});
        mapaBanderas.put(96, new String[]{"Kenia", "Nairobi"});
        mapaBanderas.put(97, new String[]{"Kirguistan", "Biskek"});
        mapaBanderas.put(98, new String[]{"Kiribati", "Tarawa del Sur"});
        //mapaBanderas.put(99, new String[]{"Kosovo", "Pristina"});
        mapaBanderas.put(100, new String[]{"Kuwait", "Ciudad de Kuwait"});
        mapaBanderas.put(101, new String[]{"Laos", "Vientian"});
        mapaBanderas.put(102, new String[]{"Lesoto", "Maseru"});
        mapaBanderas.put(103, new String[]{"Letonia", "Riga"});
        mapaBanderas.put(104, new String[]{"Libano", "Beirut"});
        mapaBanderas.put(105, new String[]{"Liberia", "Monrovia"});
        mapaBanderas.put(106, new String[]{"Libia", "Tripoli"});
        mapaBanderas.put(107, new String[]{"Liechtenstein", "Vaduz"});
        mapaBanderas.put(108, new String[]{"Lituania", "Vilna"});
        mapaBanderas.put(109, new String[]{"Luxemburgo", "Luxemburgo"});
        mapaBanderas.put(110, new String[]{"Macedonia del Norte", "Skopie"});
        mapaBanderas.put(111, new String[]{"Madagascar", "Antananarivo"});
        mapaBanderas.put(112, new String[]{"Malasia", "Kuala Lumpur"});
        mapaBanderas.put(113, new String[]{"Malaui", "Lilongue"});
        mapaBanderas.put(114, new String[]{"Maldivas", "Male"});
        mapaBanderas.put(115, new String[]{"Mali", "Bamako"});
        mapaBanderas.put(116, new String[]{"Malta", "La Valeta"});
        mapaBanderas.put(117, new String[]{"Marruecos", "Rabat"});
        mapaBanderas.put(118, new String[]{"Mauricio", "Puerto Luis"});
        mapaBanderas.put(119, new String[]{"Mauritania", "Naukchot"});
        mapaBanderas.put(120, new String[]{"Mexico", "Ciuda de Mexico"});
        mapaBanderas.put(121, new String[]{"Micronesia", "Palikir"});
        mapaBanderas.put(122, new String[]{"Moldavia", "Chisinau"});
        mapaBanderas.put(123, new String[]{"Monaco", "Monaco"});
        mapaBanderas.put(124, new String[]{"Mongolia", "Ulan Bator"});
        mapaBanderas.put(125, new String[]{"Montenegro", "Podgorica"});
        mapaBanderas.put(126, new String[]{"Mozambique", "Maputo"});
        mapaBanderas.put(127, new String[]{"Myanmar", "Naypyidaw"});
        mapaBanderas.put(128, new String[]{"Namibia", "Windhoek"});
        mapaBanderas.put(129, new String[]{"Nauru", "Yaren"});
        mapaBanderas.put(130, new String[]{"Nepal", "Katmandu"});
        mapaBanderas.put(131, new String[]{"Nicaragua", "Managua"});
        mapaBanderas.put(132, new String[]{"Niger", "Niamey"});
        mapaBanderas.put(133, new String[]{"Nigeria", "Abuya"});
        mapaBanderas.put(134, new String[]{"Noruega", "Oslo"});
        mapaBanderas.put(135, new String[]{"Nueva Zelandia", "Wellington"});
        mapaBanderas.put(136, new String[]{"Oman", "Mascate"});
        mapaBanderas.put(137, new String[]{"Paises Bajos", "Amsterdam"});
        mapaBanderas.put(138, new String[]{"Pakistan", "Islamabad"});
        mapaBanderas.put(139, new String[]{"Palaos", "Ngerulmud"});
        //mapaBanderas.put(140, new String[]{"Palestina", "Jerusalen Este"});
        mapaBanderas.put(141, new String[]{"Panama", "Ciudad de Panama"});
        mapaBanderas.put(142, new String[]{"Papua Nueva Guinea", "Port Moresby"});
        mapaBanderas.put(143, new String[]{"Paraguay", "Asuncion"});
        mapaBanderas.put(144, new String[]{"Peru", "Lima"});
        mapaBanderas.put(145, new String[]{"Polonia", "Varsovia"});
        mapaBanderas.put(146, new String[]{"Portugal", "Lisboa"});
        mapaBanderas.put(147, new String[]{"Reino Unido", "Londres"});
        mapaBanderas.put(148, new String[]{"Republica Centroafricana", "Bangui"});
        mapaBanderas.put(149, new String[]{"Republica Democratica del Congo", "Kinshasa"});
        mapaBanderas.put(150, new String[]{"Republica Dominicana", "Santo Domingo"});
        mapaBanderas.put(151, new String[]{"Rumania", "Bucarest"});
        mapaBanderas.put(152, new String[]{"Ruanda", "Kigali"});
        mapaBanderas.put(153, new String[]{"Rusia", "Moscu"});
        mapaBanderas.put(154, new String[]{"San Cristobal y Nieves", "Basseterre"});
        mapaBanderas.put(155, new String[]{"Samoa", "Apia"});
        mapaBanderas.put(156, new String[]{"San Marino", "San Marino"});
        mapaBanderas.put(157, new String[]{"San Vicente y las Granadinas", "Kingstown"});
        mapaBanderas.put(158, new String[]{"Santa Lucia", "Castries"});
        mapaBanderas.put(159, new String[]{"Santo Tome y Principe", "Santo Tome"});
        mapaBanderas.put(160, new String[]{"Senegal", "Dakar"});
        mapaBanderas.put(161, new String[]{"Serbia", "Belgrado"});
        mapaBanderas.put(162, new String[]{"Seychelles", "Victoria"});
        mapaBanderas.put(163, new String[]{"Sierra Leona", "Freetown"});
        mapaBanderas.put(164, new String[]{"Singapur", "Singapur"});
        mapaBanderas.put(165, new String[]{"Siria", "Damasco"});
        mapaBanderas.put(166, new String[]{"Somalia", "Mogadiscio"});
        mapaBanderas.put(167, new String[]{"Sri Lanka", "Sri Jayawardenapura Kotte"});
        mapaBanderas.put(168, new String[]{"Sudafrica", "Bloemfontein, Cape Town, Pretoria"});
        mapaBanderas.put(169, new String[]{"Sudan", "Jartum"});
        mapaBanderas.put(170, new String[]{"Sudan del Sur", "Juba"});
        mapaBanderas.put(171, new String[]{"Suecia", "Estocolmo"});
        mapaBanderas.put(172, new String[]{"Suiza", "Berna"});
        mapaBanderas.put(173, new String[]{"Surinam", "Paramaribo"});
        mapaBanderas.put(174, new String[]{"Tailandia", "Bangkok"});
        //mapaBanderas.put(175, new String[]{"Taiwan", "Taipei"});
        mapaBanderas.put(176, new String[]{"Tanzania", "Dodoma"});
        mapaBanderas.put(177, new String[]{"Tayikistan", "Dusambe"});
        mapaBanderas.put(178, new String[]{"Timor Oriental", "Dili"});
        mapaBanderas.put(179, new String[]{"Togo", "Lome"});
        mapaBanderas.put(180, new String[]{"Tonga", "Nukualofa"});
        mapaBanderas.put(181, new String[]{"Trinidad y Tabago", "Puerto España"});
        mapaBanderas.put(182, new String[]{"Tunez", "Tunez"});
        mapaBanderas.put(183, new String[]{"Turkmenistan", "Asgabat"});
        mapaBanderas.put(184, new String[]{"Turquia", "Ankara"});
        mapaBanderas.put(185, new String[]{"Tuvalu", "Funafuti"});
        mapaBanderas.put(186, new String[]{"Ucrania", "Kyiv"});
        mapaBanderas.put(187, new String[]{"Uganda", "Kampala"});
        mapaBanderas.put(188, new String[]{"Uruguay", "Montevideo"});
        mapaBanderas.put(189, new String[]{"Uzbekistan", "Taskent"});
        mapaBanderas.put(190, new String[]{"Vanuatu", "Port Vila"});
        //mapaBanderas.put(191, new String[]{"Vaticano", "Vaticano"});
        mapaBanderas.put(192, new String[]{"Venezuela", "Caracas"});
        mapaBanderas.put(193, new String[]{"Vietnam", "Hanoi"});
        mapaBanderas.put(194, new String[]{"Yibuti", "Yibuti"});
        mapaBanderas.put(195, new String[]{"Yemen", "Sana"});
        mapaBanderas.put(196, new String[]{"Zambia", "Lusaka"});
        mapaBanderas.put(197, new String[]{"Zimbabue", "Harare"});
        
        //99 kosovo
        //140 palestina
        //175 taiwan
        //191 vaticano
        Integer[] FlagArray = {
            1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,
            26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,
            51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,
            76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,100,
            101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,124,125,
            126,127,128,129,130,131,132,133,134,135,136,137,138,139,141,142,143,144,145,146,147,148,149,150,
            151,152,153,154,155,156,157,158,159,160,161,162,163,164,165,166,167,168,169,170,171,172,173,174,
            176,177,178,179,180,181,182,183,184,185,186,187,188,189,190,192,193,194,195,196,197
        };
        
        genBanderas = new Generador<>(FlagArray);

        Generador<Integer> genBanderas = new Generador<>(FlagArray);
        FlagLbl.setText("");
        num = genBanderas.obtenerAleatorio();       
        String ruta = "/banderas/" + num + ".png";  
        ImageIcon icon = new ImageIcon(getClass().getResource(ruta));
        Image img = icon.getImage();
        FlagLbl.setIcon(new ImageIcon(img));
        FlagLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        FlagLbl.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        
        update();
        NBtn.setEnabled(false);
        WLbl.setVisible(false);
        CLbl.setVisible(false);
        }
    private void update() {
        FlagLbl.setText("");
        num = genBanderas.obtenerAleatorio(); 
        //num =197;
        NLbl.setText(""+num);
        HLbl.setText(mapaBanderas.get(num)[0].toLowerCase()+" "+mapaBanderas.get(num)[1].toLowerCase());
        String ruta = "/banderas/" + num + ".png";
        ImageIcon icon = new ImageIcon(getClass().getResource(ruta));
        Image img = icon.getImage();
        Image imgEscalada = img.getScaledInstance(FlagLbl.getWidth(), FlagLbl.getHeight(), Image.SCALE_SMOOTH);
        FlagLbl.setIcon(new ImageIcon(imgEscalada));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        FlagLbl = new javax.swing.JLabel();
        NBtn = new javax.swing.JButton();
        TFld2 = new javax.swing.JTextField();
        CBtn = new javax.swing.JButton();
        CLbl = new javax.swing.JLabel();
        WLbl = new javax.swing.JLabel();
        TFld1 = new javax.swing.JTextField();
        PLbl1 = new javax.swing.JLabel();
        PLbl2 = new javax.swing.JLabel();
        NLbl = new javax.swing.JLabel();
        HLbl = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Introduce el país y la capital según la bandera:");

        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("UliBaker :)");

        FlagLbl.setFont(new java.awt.Font("Segoe UI", 0, 200)); // NOI18N
        FlagLbl.setForeground(new java.awt.Color(204, 204, 0));
        FlagLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        NBtn.setText("Siguiente");
        NBtn.addActionListener(this::NBtnActionPerformed);

        CBtn.setText("Check");
        CBtn.addActionListener(this::CBtnActionPerformed);

        CLbl.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        CLbl.setForeground(new java.awt.Color(0, 204, 102));
        CLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CLbl.setText("Correcto!");

        WLbl.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        WLbl.setForeground(new java.awt.Color(204, 0, 51));
        WLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WLbl.setText("Incorrecto!");

        PLbl1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        PLbl1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        PLbl1.setText("País:");

        PLbl2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        PLbl2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        PLbl2.setText("Capital:");

        NLbl.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        NLbl.setForeground(new java.awt.Color(102, 102, 102));
        NLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        NLbl.setText("n");

        HLbl.setForeground(new java.awt.Color(240, 240, 240));
        HLbl.setText("Hola");

        jButton1.setText("Volver");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addComponent(FlagLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(WLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PLbl2, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                            .addComponent(PLbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TFld2)
                            .addComponent(TFld1)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(HLbl)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(FlagLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(WLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFld1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PLbl1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFld2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PLbl2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(HLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NLbl)
                    .addComponent(jButton1)
                    .addComponent(jLabel5))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NBtnActionPerformed
        update();
        TFld2.setText("");
        TFld1.setText("");
        NBtn.setEnabled(false);
        WLbl.setVisible(false);
        CLbl.setVisible(false);
    }//GEN-LAST:event_NBtnActionPerformed

    private void CBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBtnActionPerformed
        String pc = mapaBanderas.get(num)[0].toLowerCase();
        String pu = TFld1.getText().trim().toLowerCase();
        String cc = mapaBanderas.get(num)[1].toLowerCase();
        String cu = TFld2.getText().trim().toLowerCase();
        
        if(TFld1.getText()!=null && TFld2.getText()!=null) {
            if(cu.equals(cc) && pu.equals(pc)) {
                NBtn.setEnabled(true);
                WLbl.setVisible(false);
                CLbl.setVisible(true);         
            } else {
                WLbl.setVisible(true);
            }       
        }
        
    }//GEN-LAST:event_CBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        new Ventana().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Juego().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CBtn;
    private javax.swing.JLabel CLbl;
    private javax.swing.JLabel FlagLbl;
    private javax.swing.JLabel HLbl;
    private javax.swing.JButton NBtn;
    private javax.swing.JLabel NLbl;
    private javax.swing.JLabel PLbl1;
    private javax.swing.JLabel PLbl2;
    private javax.swing.JTextField TFld1;
    private javax.swing.JTextField TFld2;
    private javax.swing.JLabel WLbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
