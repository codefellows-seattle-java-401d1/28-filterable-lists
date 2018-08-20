package droid.yutani.com.a28_filterable_lists.model;

import java.util.ArrayList;
import java.util.List;

public class BebopData {
    private static BebopData mData;
    private List<BebopCharacter> characters;

    private BebopData() {
        characters = new ArrayList<>();
        characters.add(new BebopCharacter("Spike Spiegel", "Bounty Hunter", "Spike Spiegel (Japanese: スパイク・スピーゲル Hepburn: Supaiku Supīgeru) is the protagonist of the 1998 anime series Cowboy Bebop. Spike is a former member of the criminal Red Dragon Syndicate, who left by faking his death after falling in love with a woman called Julia. He is first introduced as the partner of Jet Black, captain of the spaceship Bebop: the two are legalized bounty hunters pursuing criminals across the populated planets and moons of the solar system. During his adventures on board the Bebop, he is drawn back into a bitter feud with Vicious, a rival from the Syndicate who seeks to kill him."));
        characters.add(new BebopCharacter("Jet Black", "Bounty Hunter", "Born December 3, 2035, and known on his home satellite as the \"Black Dog\" for his tenacity, Jet Black (ジェット・ブラック Jetto Burakku) is a 36-year-old former cop from Ganymede (a Jovian satellite) and acts as Spike's foil during the series. Physically, Jet is very tall with a muscular build. He wears a beard with no mustache, and is completely bald save for the back of his head. Spike acts lazy and uninterested, whereas Jet is hard working and a jack-of-all-trades. Jet was once an investigator in the Intra Solar System Police (ISSP) for many years until he lost his arm in an investigation that went awry when his corrupt partner betrayed him. His arm was replaced with a cybernetic limb—an operation later revealed to be by choice as biological replacements were possible. He wanted the fake arm as a reminder of the consequences of his actions. His loss of limb coupled with the general corruption of the police force prompted Jet to quit the ISSP in disgust and become a freelance bounty hunter."));
        characters.add(new BebopCharacter("Faye Valentine", "Gambler", "Faye Valentine (フェイ・ヴァレンタイン Fei Varentain, born August 14, 1994) is one of the members of the bounty hunting crew in the anime series Cowboy Bebop. She is often seen with a cigarette and in a revealing outfit complete with bright yellow hot pants and a matching, revealing top (and, on occasion, a bikini). She sports violet hair, green eyes, and a voluptuous body. Although appearing to be no more than 23 years old, Faye is actually around 77 years old, having been put into cryogenic freeze after a space shuttle accident, wherein she spent fifty-four years in suspended animation. During the course of the series (set in 2071), Faye crosses paths with Spike and Jet twice and makes herself at home aboard their ship the second time around, much to the consternation and disapproval of the two men, both of whom have their own reservations about women in general."));
        characters.add(new BebopCharacter("Edward", "Hacker", "Edward Wong Hau Pepelu Tivrusky IV (エドワード・ウォン・ハウ・ペペル・チブルスキー4世 Edowādo Won Hau Peperu Chiburusukī Yonsei) is the self-invented personal name of an elite hacker prodigy from Earth. Her father calls her Françoise (フランソワーズ Furansowāzu) in one scene, but since he \"forgets the sex of his own child, it's doubtful this is Ed's real name\".[8] \"Radical Edward\" is a very strange, somewhat androgynous, teenage girl claiming to be around 13 years of age. Her mannerisms include walking around on her bare hands, performing strange postures, and her gangling walk. Ed could be considered a \"free spirit\"; she is fond of silly exclamations and childish rhymes, is easily distracted, has the habit of \"drifting off\" from reality sometimes in mid-sentence, and is the show's primary source of comic relief. Ed's generally carefree attitude and energy act as a counterpoint to the more solemn and dark aspects of the show. Ed remains a part of the Bebop crew until the 24th episode, when she, along with Ein, leaves the crew."));
        characters.add(new BebopCharacter("Ein", "Data-Dog", "Ein (アイン Ain) is a Pembroke Welsh Corgi brought aboard the Bebop by Spike after a failed attempt to capture a bounty. Ein is referred to as a \"data dog\" by the scientists that created him. He often shows heightened awareness of events going on around him. Over the course of the series, Ein answers the telephone, steers a car, uses the SSW, plays shogi, operates the \"Brain Dream\" gaming device, and generally performs tasks that an average canine would not be able to accomplish."));
        characters.add(new BebopCharacter("Vicious", "Syndicate Assassin", "\"Vicious\" (ビシャス Bishasu) is a recurring villain in Cowboy Bebop. He is ruthless, bloodthirsty, cunning and ambitious. He is a member of the Red Dragon Crime Syndicate in Tharsis, and is often referred to or depicted as a venomous snake (as opposed to Spike who is referred to as a swimming bird and the Syndicate Elders who see themselves as a dragon). His weapon of choice is a katana which he wields skillfully, even against gun-wielders. He was an infantry rifleman during the Titan War and is shown firing a semi-automatic pistol in a Session 5 flashback, as well as in the Session 26 flashback of him and Spike fighting back-to-back. Early on, Vicious is seen with a black bird on his shoulder. Though he is shown feeding it in one scene, indicating that it is not a robot, he eventually hides explosives in its stomach and detonates them as a distraction during an escape."));
    }

    public static BebopData getData() {
        if (mData == null) {
            mData = new BebopData();
        }
        return mData;
    }

    public List<BebopCharacter> characters() {
        return characters;
    }
}
