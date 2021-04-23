package Inheritance_and_Interface.University;

import Inheritance_and_Interface.University.EmployeePackage.FacultyPackage.Administrator;
import Inheritance_and_Interface.University.EmployeePackage.FacultyPackage.Teacher;

public class Main {

    public static void main(String[] args) {
        University ozu = new University("Ozyegin","Esra Gençtürk");
        System.out.println(ozu);
        System.out.println(ozu.getNameOfUniversity());

        //--------------------------------------- Teacher Class ---------------------------------------------//
        Teacher Ethem = new Teacher("Ethem Alpaydın",ozu,"Faculty of Engineering","Computer Science");
        Teacher Ismail = new Teacher("Ismail Arı",ozu,"Faculty of Engineering","Computer Science");
        Teacher Reyhan = new Teacher("Reyhan Aydoğan",ozu,"Faculty of Engineering","Computer Science");

        Ethem.addResearchAreas("Machine Learning");
        Ethem.addResearchAreas("Artificial Intelligence");
        Ethem.addResearchAreas("Pattern Recognition");
        Ismail.addResearchAreas("Cloud Computing");
        Ismail.addResearchAreas("Data Mining Models and Databases");
        Ismail.addResearchAreas("Data Stream and Complex Event Processing");
        Ismail.addResearchAreas("Web Services");
        Ismail.addResearchAreas("SOA");
        Ismail.addResearchAreas("Session Management");
        Ismail.addResearchAreas("File and Storage System");
        Ismail.addResearchAreas("Adaptive Caching");
        Ismail.addResearchAreas("Computer Networks");
        Reyhan.addResearchAreas("Automated Negotiation");
        Reyhan.addResearchAreas("Multi-agent System");
        Reyhan.addResearchAreas("Decision Support System");
        Reyhan.addResearchAreas("Machine Learning");
        Reyhan.addResearchAreas("Semantic Web");
        Reyhan.addResearchAreas("Human-Machine Interaction");

        Reyhan.setCV("\n" +
                "Biography,\n" +
                "Dr. Reyhan Aydoğan received her Ph. D. degree in Computer Engineering in 2011 from Boğaziçi \n" +
                "University, Istanbul, Turkey. During her doctoral study, she worked as a research and teaching \n" +
                "assistant at the same department. In 2011, Dr. Aydoğan joined the Interactive Intelligence Group \n" +
                "at Delft University of Technology as a postdoctoral researcher where she worked in different \n" +
                "research projects. As a guest researcher, she visited the Center of Collective Intelligence at \n" +
                "MIT in 2013 and Intelligence Systems Group at Norwegian University of Science and Technology in \n" +
                "2015. Her research focuses on the modeling, development and analysis of agent technologies that \n" +
                "integrate different aspects of intelligence such as reasoning, decision making and learning. She \n" +
                "is applying artificial intelligence techniques such as machine learning and semantic reasoning in \n" +
                "designing and developing agent-based decision support systems, particularly negotiation support \n" +
                "systems and automated negotiation tools. Dr. Aydoğan is one of the main organizers of the \n" +
                "International Automated Negotiating Agents Competition (ANAC).\n");

        Ismail.setCV("\n" +
                "Biography,\n" +
                "Dr. İsmail Ari received his PhD degree in 2004 from Computer Science Department of University of \n" +
                "California, Santa Cruz. Between 2004-2009 he worked as a researcher in Hewlett Packard Labs in Silicon \n" +
                "Valley, USA. His research interests include cloud computing, service-oriented architectures, data \n" +
                "mining, data stream processing, complex event processing and networked storage systems. He has \n" +
                "international publications and US patents related to these topics. After joining Özyeğin University \n" +
                "in 2009 he has received several awards and research grants including IBM Top Faculty Contributor \n" +
                "Award, EU Marie Curie IRG (International Reintegration Grant), and TÜBİTAK (Turkish NSF) National \n" +
                "Young Researcher Carreer Award. Dr. Ari is a member of IEEE, ACM and a founding member of the IBM \n" +
                "Cloud Academy.\n");

        Ethem.setCV("\n" +
                "Biography,\n" +
                "Dr. Ethem Alpaydın obtained his B.Sc. from Boğaziçi University, Department of Computer Engineering \n" +
                "in 1987 and Ph.D. in Computer Engineering from Ecole Polytechnique Fédérale de Lausanne in 1990. He \n" +
                "started working as assistant professor in the Department of Computer Engineering of Boğaziçi \n" +
                "University in 1991 and was appointed associate professor in 1996 and professor in 2002; he retired \n" +
                "in January 2019.  He held visiting research positions at University of California, Berkeley in 1991 \n" +
                "and 1997, MIT in 1994, IDIAP in 1998, and Technical University of Delft in 2014. He was a Fulbright \n" +
                "scholar in 1997 and received the Research Excellence Award from the Boğaziçi University Foundation in \n" +
                "1998 (junior faculty) and 2008 (senior faculty), the Young Scientist Award from the Turkish Academy of \n" +
                "Sciences in 2001 and the Scientific Encouragement Award from the Turkish Scientific and Technical \n" +
                "Research Council in 2002. He was elected a member of the Science Academy in 2012. His book, \n" +
                "Introduction to Machine Learning, was published by the MIT Press in 2004, with its second and third \n" +
                "editions in 2008 and 2014, and was translated into Chinese and German; its Turkish edition was \n" +
                "published in 2011. Another book, Machine Learning: The New AI, was published by the MIT Press in 2016 \n" +
                "and since then was translated into Japanese, Russian, and Korean. His research focuses on artificial \n" +
                "intelligence and machine learning.\n");

        System.out.println(Ethem);
        System.out.println(Ethem.getCv());
        System.out.println(Ismail);
        System.out.println(Ismail.getCv());
        System.out.println(Reyhan);
        System.out.println(Reyhan.getCv());

        //--------------------------------------- Administrator Class ---------------------------------------------//

        Administrator Hasan = new Administrator("Hasan Sözer",ozu,"Faculty of Engineering","Computer Science","Computer Engineering Department");
        Administrator Reha = new Administrator("Reha Civanlar",ozu,"Faculty of Engineering","Computer Science","Faculty of Engineering");

        Hasan.addResearchAreas("Software engineering");
        Hasan.addResearchAreas(" software architecture design");
        Hasan.addResearchAreas("software reliability engineering");
        Hasan.addResearchAreas("software fault tolerance");
        Hasan.addResearchAreas("distributed and self-adaptive systems");

        Hasan.setCV("Biography\n" +
                "Hasan Sözer received his B.Sc. and M.Sc. degrees in computer engineering from Bilkent University, \n" +
                "Turkey, in 2002 and 2004, respectively. He received his Ph.D. degree in 2009 from the University of \n" +
                "Twente, The Netherlands. From 2002 until 2005, he worked as a software engineer at Aselsan Inc. in \n" +
                "Turkey. From 2009 until 2011, he worked as a post-doctoral researcher at the University of Twente. \n" +
                "He has been working as a faculty member at Ozyegin University since 2011.\n");

        Reha.setCV("\n" +
                "Biography\n" +
                "Dr. Civanlar is Vice Rector at Ozyegin Univ., Istanbul. He was a VP in DOCOMO USA Labs, Palo Alto, 2006 - 2008, and a visiting Prof. of Computer Engineering at Koc Univ., Istanbul, 2002- 2006. He is on advisory boards of Vidyo Inc., USA and Argela Tech. Inc., Turkey.\n" +
                "\n" +
                "Before Koc University, he was head of Visual Comm. Research Dept. at AT&T Labs-Research, where he worked since '91. Prior to that, he was at Pixel Machines Dept. of Bell Labs. His career started in the Center for Comm. and Signal Proc. of NCSU, upon receiving his ECE PhD in 84 from the same university. He received his BS and MS degrees in EE from METU, Turkey.\n" +
                "\n" +
                "He has numerous publications, several contributions to international standards, and over forty patents. He is a recipient of 1985 Senior Award of the ASSP. His current research interests include networked video and multimedia with emphasis on the Internet and wireless systems.\n" +
                "\n" +
                "Dr. Civanlar is a Fulbright scholar and a member of Sigma Xi. He served as an editor for IEEE Trans. on Comm. and Trans. on Multimedia, JASP and EURASIP Image Comm. He served as a member of MMSP and MDSP TCs of the Sig. Proc. Society. Dr. Civanlar is a fellow of IEEE.");

        System.out.println(Hasan);
        System.out.println(Hasan.getCv());

        System.out.println(Reha);
        System.out.println(Reha.getCv());

        ozu.listOfEmployee();

        //--------------------------------------- Student Class ---------------------------------------------//

        Student Arda = new Student("Arda Erdoğan","S020973","Samsun","Computer Science",2019,ozu);
        Student Ekin = new Student("Ekin Akan", "S030982","Edirne","Electrical & Electronics Engineering",2019,ozu);
        Student Selin = new Student("Selin Taneri","S040278","Samsun","Gastronomi",2019,ozu);

        System.out.println(Ekin);
        System.out.println(Arda);
        System.out.println(Selin);

        ozu.listOfStudent();
        System.out.println(ozu);
    }

}
