<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" lang="fr" xml:lang="fr">
<h2>Version courte <h2>

<p> Pour chacune des classes vue en TD vous devez écrire des tests pour chacune des méthodes et ensuite vous implémenterez ces méthodes. Vous avez un exemple de squelette pour la classe <code>Vector</code>.</p> 

<h2>Objectif</h2>

<p>L'objectif de ce TP est de mettre en place des pratiques de programmation permettant
    de produire un code correct et lisible. Ce premier TP est assez long à réaliser. Il est impératif de vous concentrer
    sur votre TP et de travailler entre les TP pour le terminer.</p>

<p>La démarche que vous allez suivre pour implémenter les exercices du TD est la suivante. Vous allez faire dans l'ordre
    les trois points suivants :
<ul>
    <li>Écriture de commentaires pour spécifier <b>précisément</b> le comportement des classes et méthodes.</li>
    <li>Écriture de tests permettant de vérifier la <b>totalité</b> de la spécification.</li>
    <li>Écriture du code des méthodes de façon <b>la plus lisible possible</b>.</li>
</ul>
</p>

<h2>Vecteur d'entiers</h2>

<h3>Écriture des tests</h3>

<p>Les tests permettent de vérifier à chaque étape du développement que le code écrit est correct, c'est-à-dire,
    qu'il vérifie les spécifications. Les tests vont être écrits sous la forme de petites méthodes qui vérifient
    un des comportements attendus. </p>

<p>Faites un clic droit sur la classe <code>Vector</code> et créez un nouveau <code>JUnit Test Case</code>.
    Sélectionnez <code>New JUnit 4 test</code>, le répertoire <code>src/test/java</code> et nommez
    la classe <code>VectorTest</code>. Normalement, la nouvelle classe contient un code qui ressemble à celui-ci : <p>

    <code>
        public class VectorTest {
        @Test
        public void test() {
        fail("Not yet implemented");
        }
        }
    </code>

<p>Placez vous sur la classe et <code>VectorTest</code> et exécutez son contenu à l'aide de la flèche
    verte d'<code>Eclipse</code>. Normalement, vous devriez voir apparaître le résultat de l'exécution
    avec un échec rencontré sur la méthode <code>void test()</code>. En effet, la méthode
    <code>test()</code> est annotée par <code>@Test</code>. Par conséquent, elle est exécutée comme
    un test par <code>JUnit</code>. La ligne <code>fail("Not yet implemented");</code> génère l'échec
    obtenu par l'exécution des tests.</p>

<p>Vous allez écrire des méthodes dans la classe <code>VectorTest</code> afin de tester les différentes
    fonctionnalités de la classe <code>Vector</code>. Pour cela, vous allez remplacer le code de la classe
    <code>VectorTest</code> par le code suivant et le compléter en vous inspirant des tests déjà écrits.
    Les deux premières lignes commençant par <code>import static</code> permettent d'avoir accès
    directement aux méthodes statiques des classes <code>MatcherAssert</code> et <code>Matchers</code>
    de <code>hamcrest</code> : cela permet par exemple d'utiliser la méthode <code>equalTo</code>
    sans avoir à écrire <code>org.hamcrest.Matchers.equalTo</code>. Un tutoriel de la librairie
    <code>Hamcrest</code> est donné <a href="https://code.google.com/archive/p/hamcrest/wikis/Tutorial.wiki">ici</a>.</p>

<code>
	
    import static org.hamcrest.MatcherAssert.assertThat;
    import static org.hamcrest.Matchers.*;

    import org.junit.Test;

    public class VectorTest {

    @Test
    public void testVectorInt() {
    Vector vector = new Vector(123);
    assertThat(vector.capacity(), equalTo(123));
    assertThat(vector.size(), equalTo(0));
    }

    @Test
    public void testVector() {
    Vector vector = new Vector();
    assertThat(vector.capacity(), equalTo(10));
    assertThat(vector.size(), equalTo(0));
    }

    @Test
    public void testEnsureCapacity_CapacityDoubled() {
    Vector vector = new Vector(23);
    vector.ensureCapacity(24);
    assertThat(vector.capacity(), greaterThanOrEqualTo(23*2));
    }

    @Test
    public void testEnsureCapacity_CapacitySatified() {
    Vector vector = new Vector(23);
    vector.ensureCapacity(120);
    /* TODO */
    fail("not yet implemented");
    }

    @Test
    public void testEnsureCapacity_CapacityAlwaysIncreased() {
    Vector vector = new Vector(120);
    vector.ensureCapacity(10);
    assertThat(vector.capacity(), equalTo(120));
    }

    @Test
    public void testResize() {
    Vector vector = new Vector();
    vector.resize(120);
    /* TODO */
    fail("not yet implemented");
    }

    @Test
    public void testResize_Zeros() {
    Vector vector = new Vector(1);
    vector.add(2);
    vector.resize(0);
    vector.resize(1);
    assertThat(vector.get(0), equalTo(0));
    }

    @Test
    public void testResize_CapacityIncreased() {
    /* TODO */
    fail("not yet implemented");
    }

    @Test
    public void testResize_CapacityAlwaysIncreased() {
    /* TODO */
    fail("not yet implemented");
    }

    @Test
    public void testIsEmpty() {
    Vector vector = new Vector();
    assertThat(vector.isEmpty(), equalTo(true));
    vector.resize(12);
    /* TODO */
    fail("not yet implemented");
    }

    @Test
    public void testAdd() {
    Vector vector = new Vector();
    vector.add(12);
    vector.add(13);
    vector.add(10);
    assertThat(vector.size(), equalTo(3));
    assertThat(vector.get(0), equalTo(12));
    assertThat(vector.get(1), equalTo(13));
    assertThat(vector.get(2), equalTo(10));
    vector.resize(1);
    vector.add(2);
    /* TODO */
    fail("not yet implemented");
    }

    @Test
    public void testSet() {
    Vector vector = new Vector();
    vector.add(12);
    vector.add(13);
    vector.add(10);
    vector.set(0, 2);
    vector.set(2, 4);
    vector.set(3, 123);
    /* TODO */
    fail("not yet implemented");
    }

    @Test
    public void testGet() {
    Vector vector = new Vector();
    vector.add(12);
    vector.add(13);
    /* TODO : tester également le fait d'être en dehors des bornes. */
    fail("not yet implemented");
    }

    }
</code>

<h3>Implémentation de la classe Vector</h3>

<p>Vous pouvez maintenant implémenter la classe <code>Vector</code> en vérifiant
    à chaque étape de son implémentation que de nouveaux tests passent au vert.
    N'hésitez pas à utiliser le débogueur d'Eclipse si vous avez des problèmes
    pour trouver vos erreurs. Évidemment, les erreurs peuvent se trouver dans
    les tests ou dans le code de la classe Vector. Dans tous les cas, vous ne
    devez modifier les tests uniquement s'ils sont en désaccords avec les
    spécifications de la classe.</p>

<h2>Pile d'entiers</h2>

<p>Effectuez les mêmes étapes que pour l'exercice précédent afin d'ajouter
    à votre projet la nouvelle classe <code>Stack</code> qui utilise
    la classe <code>Vector</code> afin d'implémenter une pile. Vous devez
    donc écrire les spécifications de la classe, écrire une classe
    de tests, puis implémenter la classe <code>Stack</code>. Cette classe
    peut être placée dans un package <code>fr.licinfo.structure</code>. </p>

<h2>Filtres de chaînes de caractères</h2>

<p>Nous allons programmer les classes de l'exercice 3 du TD en utilisant la même démarche de "qualité".
    Créez un nouveau projet Maven de nom <code>stringfilter</code>, configurez-le afin de pouvoir utiliser
    <code>JUnit 4</code> et <code>Hamcrest</code>.</p>

<p>Définissez ensuite l'interface <code>StringFilter</code> et commentez-là. Créez ensuite les différentes classes
    qui implémentent l'interface <code>StringFilter</code>. Écrivez les commentaires précisant leurs spécifications
    <b>sans les implémenter</b>.</p>

<p>Ajoutez une classe de tests <code>StringFilterTest</code>. Dans cette classe, ajoutez une méthode testant
    chacune des implémentations de <code>StringFilter</code>. Par exemple, vous pouvez ajouter la méthode suivante
    pour tester la classe <code>UpperCaseStringFilter</code> : </p>

<code>	
	
	@Test
	public void upperCaseStringFilter() {
		String input = "toto";
		StringFilter filter = new UpperCaseStringFilter();
		String output = filter.filter(input);
		assertThat(output, equalTo("TOTO"));
	}
</code>

<p>Implémentez ensuite les différents filtres en vérifiant que votre code est correct à l'aide des tests.</p>
</div>
<ul id="slide-out" class="right side-nav"></ul>
</div>

<footer class="page-footer teal lighten-2">
    <div class="footer-copyright">
        <div class="center-align">
            &copy; 2018 Bertrand Estellon
        </div>
    </div>
</footer>

</body>

</html>
