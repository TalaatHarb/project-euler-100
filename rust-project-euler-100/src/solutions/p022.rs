use crate::Solvable;

const P022_DATA: &str = include_str!("p022.txt");

fn name_value(name: &str) -> i64 {
    name.bytes().map(|b| (b - b'A' + 1) as i64).sum()
}

pub struct P022;
impl Solvable for P022 {
    fn problem_name(&self) -> &str { "p022" }
    fn solve(&self) -> i64 {
        let raw = P022_DATA.trim();
        let mut names: Vec<&str> = raw.split(',').map(|s| s.trim_matches('"')).collect();
        names.sort_unstable();
        names.iter().enumerate().map(|(i, name)| name_value(name) * (i as i64 + 1)).sum()
    }
}
